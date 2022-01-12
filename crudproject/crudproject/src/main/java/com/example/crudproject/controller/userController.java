package com.example.crudproject.controller;


import com.example.crudproject.model.user;
import com.example.crudproject.repository.userRepository;
import com.example.crudproject.service.UserService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController

public class userController
{

    @Autowired
    private UserService userService;

    @GetMapping("/api")
    public List<user> getAllusers()
    {
        return userService.getAlluser();
    }
    //method for create operation


    @PostMapping("/api")
    public void createuser(@RequestBody user user1)
    {
          this.userService.adduser(user1);
    }


    @DeleteMapping("/api/{id}")
    public void deleteuser(@PathVariable("id") int id){

        userService.deluser(id);

    }


    @PutMapping("/api/{id}")
    public void update(@RequestBody user u,@PathVariable("id") int id){
        userService.updateuser(u,id);
    }



}
