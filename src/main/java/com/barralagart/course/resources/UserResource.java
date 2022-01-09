package com.barralagart.course.resources;

import com.barralagart.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UserResource {

    @GetMapping("/users")
    public ResponseEntity<User> findAll() {

        User u = new User(1, "Natan", "natan@email.com", "45991534092", "1234");

        return ResponseEntity.ok().body(u);
    }

    @GetMapping("/hello")
    public String hello(@RequestParam(value = "name", defaultValue = "Bitch") String name) {
        return "Hello, " + name;
    }
}
