package com.springboot.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserBean user;

    public void displayUser() {
        System.out.println("3️⃣ Using Bean in Service");
        user.printUser();
    }
}
