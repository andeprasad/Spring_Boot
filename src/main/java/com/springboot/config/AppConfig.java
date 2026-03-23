package com.springboot.config;

import com.springboot.bean.UserBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
    @Bean
    public UserBean userBean() {
        System.out.println("2️⃣ Inside @Bean method");

        return new UserBean("prasad", "prasad@gmail.com");
    }

    // Example: multiple beans of same type
//    @Bean
//    public User anotherUserBean() {
//        return new User("admin", "admin@gmail.com");
//    }
}
