package com.springboot.annotation.requestmapping;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mapping")
public class MappingController {

    // -------------------------
    // GET - Fetch User
    // -------------------------
    @GetMapping("/user")
    public String getUser() {
        return "GET: Fetching user details";
    }

    // -------------------------
    // POST - Create User
    // -------------------------
    @PostMapping(value = "/user", consumes = "application/json", produces = "application/json")
    public String createUser() {
        return "{ \"message\": \"POST: User created successfully\" }";
    }

    // -------------------------
    // PUT - Update User
    // -------------------------
    @PutMapping(value = "/user/{id}", consumes = "application/json", produces = "application/json")
    public String updateUser(@PathVariable int id) {
        return "{ \"message\": \"PUT: User with ID " + id + " updated successfully\" }";
    }

    // -------------------------
    // DELETE - Delete User
    // -------------------------
    @DeleteMapping("/user/{id}")
    public String deleteUser(@PathVariable int id) {
        return "DELETE: User with ID " + id + " deleted successfully";
    }
}
