package com.barralagart.course.resources;

import com.barralagart.course.entities.User;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/users")
public class UserResource {

    @GetMapping
    public ResponseEntity<User> findAll() {

        User u = new User(1, "Natan", "natan@email.com", "45991534092", "1234");

        return ResponseEntity.ok().body(u);
    }
}
