package com.social.backend.common.enums;

import java.util.Arrays;

/**
 * Enum for Gender
 */
public enum Gender {

    MALE("Male"),
    FEMALE("Female"),
    NOT_SPECIFIED("Not specified");

    private final String displayName;

    Gender(String displayName) {
        this.displayName = displayName;
    }

    public String getDisplayName() {
        return this.displayName;
    }

    public static Gender fromDisplayName(String displayName) {
        return Arrays.stream(Gender.values())
                .filter(gender -> gender.displayName.equalsIgnoreCase(displayName))
                .findFirst()
                .orElse(NOT_SPECIFIED);
    }
}
