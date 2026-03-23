package com.springboot.bean;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
import org.springframework.stereotype.Component;

//This code is being used when we are using it as component.
@Component
public class UserComponent {
    public UserComponent() {
        System.out.println("1️⃣ Constructor: Bean Created using Component");
    }

    @PostConstruct
    public void init() {
        System.out.println("2️⃣ PostConstruct: Bean Initialized using Component");
    }

    public void useBean() {
        System.out.println("3️⃣ Using the Bean using Component");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("4️⃣ PreDestroy: Bean Destroyed using Component");
    }
}
