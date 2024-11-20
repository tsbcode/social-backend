package com.social.backend.authentication.dto;

/**
 * DTO class for user account related details
 */
public class AuthenticationDetails {

    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private String birthDate;
    private String gender;

    public AuthenticationDetails(String firstName, String lastName, String email, String password, String birthDate, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
        this.birthDate = birthDate;
        this.gender = gender;
    }

    public AuthenticationDetails(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getGender() {
        return gender;
    }
}
