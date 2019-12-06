package com.udemy.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Login {
    @JsonProperty
    private String email;
    @JsonProperty
    private String password;

    public Login(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
