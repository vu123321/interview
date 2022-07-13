package com.bdb.spring.demo.controller;

import com.bdb.spring.demo.dto.UserCreateDto;
import com.bdb.spring.demo.dto.UserUpdateDto;
import com.bdb.spring.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

//1. Example pagination api
//2. Example of many-to-one/ one-to-many relation. Unidirectional vs Bidirectional relation
//3. Read properties from application.properties
//4. Read environment variables
//5. Example of spring profiles (different properties profiles, example of creating beans based on profiles)

@RestController
@RequestMapping("/api/v1/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @GetMapping
    public ResponseEntity<?> getAll() {
        return ResponseEntity.ok(userService.getAll());
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable("id") Long id) {
        return ResponseEntity.ok(userService.getOne(id));
    }

    @PostMapping
    public ResponseEntity<?> create(@RequestBody UserCreateDto userCreateDto) {
        return new ResponseEntity<>(userService.create(userCreateDto), HttpStatus.CREATED);
    }

    @PutMapping
    public ResponseEntity<?> update(@RequestBody UserUpdateDto userUpdateDto) {
        return ResponseEntity.ok(userService.update(userUpdateDto));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") Long id) {
        userService.delete(id);
        return ResponseEntity.noContent().build();
    }
}
