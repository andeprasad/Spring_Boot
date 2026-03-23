package com.springboot.bean;

public class UserBean {
    private String username;
    private String email;

    public UserBean(String username, String email) {
        System.out.println("1️⃣ Constructor: Creating User Bean");
        this.username = username;
        this.email = email;
    }

    public void printUser() {
        System.out.println("User: " + username + " | Email: " + email);
    }
}
