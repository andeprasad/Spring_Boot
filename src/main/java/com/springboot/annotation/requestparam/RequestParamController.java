package com.springboot.annotation.requestparam;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/param")
public class RequestParamController {

    @GetMapping("/user")
    public String getUser(
            @RequestParam String firstName,
            @RequestParam(required = false) String lastName,
            @RequestParam int age
    ) {
        return "User: " + firstName + " " + lastName + " (Age: " + age + ")";
    }
}

