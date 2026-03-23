package com.springboot.bean;

import com.springboot.Application;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;

public class BeanLifeCycle {
    public static void main(String[] args) {

        ConfigurableApplicationContext context =
                SpringApplication.run(Application.class, args);

        System.out.println("Application Started...");

        // Get bean using @Component from UserComponent
        UserComponent user = context.getBean(UserComponent.class);
        user.useBean();
        System.out.println("---------------------Object using Component has been ended");

//        Using Bean from @Configuration config/AppConfig class
        UserService service = context.getBean(UserService.class);
        service.displayUser();
        System.out.println("---------------------Object using Bean has been ended");

        // Close context (IMPORTANT for @PreDestroy)
        context.close();
    }
}
