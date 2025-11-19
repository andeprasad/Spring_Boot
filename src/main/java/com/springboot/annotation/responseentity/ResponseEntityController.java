package com.springboot.annotation.responseentity;

import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/response")
public class ResponseEntityController {

    @GetMapping("/message")
    public ResponseEntity<String> getMessage() {
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .header("Custom-Header", "Demo")
                .body("Resource successfully created!");
    }
}
