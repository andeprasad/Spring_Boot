package com.springboot.annotation.requestbody;

import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

    @JsonProperty("user_name")
    private String username;

    private String email;

    // getters & setters

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}
