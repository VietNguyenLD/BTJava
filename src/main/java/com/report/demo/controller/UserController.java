package com.report.demo.controller;

import com.report.demo.entity.User;
import com.report.demo.service.ServiceResult;
import com.report.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMessage;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1")
public class UserController {

    @Autowired
    private UserService service;

    /* CREATE USER */
    @PostMapping("/user")
    public ResponseEntity<ServiceResult> addUser(@RequestBody User user) {
        return new ResponseEntity<ServiceResult>(service.saveUser(user), HttpStatus.OK);
    }

    /* CREATE LIST USER */
    @PostMapping("/users")
    public ResponseEntity<ServiceResult> addUsers(@RequestBody List<User> users) {
        return new ResponseEntity<ServiceResult>(service.saveUsers(users), HttpStatus.OK);
    }

    /* GET LIST USER */
    @GetMapping("/users")
    public ResponseEntity<ServiceResult> findAllUsers() {
        return new ResponseEntity<ServiceResult>(service.getUsers(),HttpStatus.OK);
    }

    /* GET USER BY ID */
    @GetMapping("/user/{id}")
    public ResponseEntity<ServiceResult> findUserById(@PathVariable int id) {
        return new ResponseEntity<ServiceResult>(service.getUserById(id), HttpStatus.OK);
    }

    /* GET USER BY USER NAME */
//    @GetMapping("/user/{username}")
//    public ResponseEntity<ServiceResult> findUserByUserName(@PathVariable String userName) {
//        return new ResponseEntity<ServiceResult>(service.getUserByUserName(userName), HttpStatus.OK);
//    }

    /* UPDATE USER */
    @PutMapping("/user")
    public ResponseEntity<ServiceResult> updateUser(@RequestBody User user) {
        return new ResponseEntity<ServiceResult>(service.updateUser(user), HttpStatus.OK);
    }

    /* DELETE BY ID */
    @GetMapping("/delete/{id}")
    public ResponseEntity<ServiceResult> deleteUser(@PathVariable int id) {
        return new ResponseEntity<ServiceResult>(service.deleteUser(id), HttpStatus.OK);
    }


}
