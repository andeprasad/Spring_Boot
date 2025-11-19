package com.springboot.annotation.initbinder;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/binder")
public class InitBinderController {

    @InitBinder
    protected void initBinder(WebDataBinder binder) {
        binder.registerCustomEditor(String.class, "firstName", new FirstNameEditor());
    }

    @GetMapping("/user")
    public String getUser(
            @RequestParam String firstName,
            @RequestParam String lastName
    ) {
        return "First: " + firstName + ", Last: " + lastName;
    }
}
