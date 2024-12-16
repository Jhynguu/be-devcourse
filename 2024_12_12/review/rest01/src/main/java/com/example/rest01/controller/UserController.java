package com.example.rest01.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    private List<String> users = new ArrayList<>();

    @GetMapping
    public List<String> getUsers() {
        return users;
    }

    @PostMapping
    public String createUser(@RequestBody String user) {
        users.add(user);
        return "User created";
    }

    @PutMapping("/{id}")
    public String updateUser(@PathVariable int id, @RequestBody String user) {
        users.set(id, user);
        return "User updated";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable int id) {
        users.remove(id);
        return "User deleted";
    }
}
