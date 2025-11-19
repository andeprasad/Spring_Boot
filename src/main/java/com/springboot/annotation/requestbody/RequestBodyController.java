package com.springboot.annotation.requestbody;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/body")
public class RequestBodyController {

    @PostMapping("/save")
    public String save(@RequestBody User user) {
        return "User: " + user.getUsername() + ", Email: " + user.getEmail();
    }
}
