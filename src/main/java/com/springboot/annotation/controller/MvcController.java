package com.springboot.annotation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MvcController {
    @GetMapping("/helloView")
    @ResponseBody
    public String hello() {
        return "Hello from @Controller";
    }
}
