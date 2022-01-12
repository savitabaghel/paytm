package com.example.crudproject.controller;


import com.example.crudproject.model.user;
import com.example.crudproject.repository.userRepository;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController

public class userController
{

    @Autowired
    private userRepository userRepository;

    @GetMapping("/api")
    public List<user> getAllusers()
    {
        return( List<user>) userRepository.findAll();
    }



}
