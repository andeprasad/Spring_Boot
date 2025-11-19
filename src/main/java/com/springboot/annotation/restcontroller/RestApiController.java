package com.springboot.annotation.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {
    @GetMapping("/helloRest")
    public String helloRest() {
        return "Hello from @RestController (JSON Response)";
    }
}
