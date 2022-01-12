package com.example.crudproject.service;

import com.example.crudproject.model.user;
import com.example.crudproject.repository.userRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;


@Component

public class UserService
{
    @Autowired
    private userRepository userrepository;

    public List<user>getAlluser()
    {
        return (List<user>) this.userrepository.findAll();
    }
    public void adduser(user user1){
        userrepository.save(user1);
    }
    public void deluser(int id){
        userrepository.deleteById(id);
    }
    public void updateuser(user u,int id)
    {
        u.setId(id);

        userrepository.save(u);

    }

}
