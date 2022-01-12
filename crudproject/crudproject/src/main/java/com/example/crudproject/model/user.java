package com.example.crudproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="users")

public class user {

    @Id


    @Column(name="first_name")
    private String firstname;

    @Column(name="last_name")
    private String lastname;

    @Column(name="emailid")
    private String  emailid;

    @Column(name="mobilen")
    private  long mobileno;

    @Column(name="address1")
    private String address1;

    @Column(name="address2")
    private String address2;
}
