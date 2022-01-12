package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonAnySetter;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstrutor;
import lombok.Setter;

import javax.persistence.*;


@Getter
@Setter



public class user {

    private long id;

    private String firstname;

    private String lastname;

    private long mobileno;

    private String emailid;

    private String address1;

    private String address2;


}
