package com.example.summer.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/users/login" , method = RequestMethod.POST)
    public ResponseEntity<String> loginUser(@RequestBody User user){
        String checkLogin = userService.checkLogin(user);
        return new ResponseEntity<>(checkLogin, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/users/signup" , method = RequestMethod.POST)
    public ResponseEntity<String> addUser(@RequestBody User user){
        String savedUserId = userService.addUser(user);
        return new ResponseEntity<>(savedUserId, HttpStatus.CREATED);
    }
}
