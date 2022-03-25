package com.example.demo.registration;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@Getter
@AllArgsConstructor
@EqualsAndHashCode
@ToString
public class RegistrationRequest {
    private final String firstName;
    private final String username;
    private final String lastName;
    private final String password;
    private final String email;
    private final Integer zipCode;
    private final String city;
    private final String state;
    private final String country;

}
