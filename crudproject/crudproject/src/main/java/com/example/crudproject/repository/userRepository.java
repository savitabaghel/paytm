package com.example.crudproject.repository;


import com.example.crudproject.model.user;
import org.springframework.data.repository.CrudRepository;

public interface userRepository extends CrudRepository<user,String> {

    //all crud database method
}
