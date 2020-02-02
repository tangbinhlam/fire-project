package edu.miu.cs544.controller;

import edu.miu.cs544.domain.User;
import edu.miu.cs544.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/users")
    public ResponseEntity<User> addUser(@Valid User user) {
        return ResponseEntity.status(HttpStatus.CREATED).body(userService.createUser(user));
    }

    @GetMapping("/users/{userName}")
    @ResponseStatus(HttpStatus.OK)
    public User readUser(@PathVariable String userName) {
        return userService.readUser(userName);
    }

    @GetMapping("/users")
    @ResponseStatus(HttpStatus.OK)
    public List<User> findAll() {
        return userService.findAll();
    }
}
