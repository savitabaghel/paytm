package com.example.crudproject.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)

public class errorhandler extends RuntimeException{

    public errorhandler(String message){
        super(message);
    }
}
