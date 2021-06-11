package com.Monsters.Bolgging_App.model;

import com.Monsters.Bolgging_App.dto.UserDTO;

import javax.persistence.*;

@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String username;
    private String password;
    private String email;
    private String firstname;
    private String lastname;
    private String address;



    public User(int id, String username, String password, String email, String firstname, String lastname, String address) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.email = email;
        this.firstname = firstname;
        this.lastname = lastname;
        this.address = address;
    }

    public User(UserDTO userDto){
        this.id= userDto.getId();
        this.username= userDto.getUsername();
        this.password= userDto.getPassword();
        this.email= userDto.getEmail();
        this.firstname= userDto.getFirstname();
        this.lastname= userDto.getLastname();
        this.address= userDto.getAddress();
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
