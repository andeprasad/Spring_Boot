package com.springboot.annotation.pathvariable;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/path")
public class PathVariableController {

    @GetMapping("/user/{name}/{age}")
    public String getUser(
            @PathVariable String name,
            @PathVariable int age
    ) {
        return "User: " + name + ", Age: " + age;
    }
}
