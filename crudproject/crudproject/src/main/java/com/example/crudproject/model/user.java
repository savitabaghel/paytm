package com.example.crudproject.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="users")

public class user {



    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="userid")
    private int id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public long getMobileno() {
        return mobileno;
    }

    public void setMobileno(long mobileno) {
        this.mobileno = mobileno;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public user(int id, String firstname, String lastname, String emailid, long mobileno, String address1, String address2) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.emailid = emailid;
        this.mobileno = mobileno;
        this.address1 = address1;
        this.address2 = address2;
    }

    public user() {
    }
}
