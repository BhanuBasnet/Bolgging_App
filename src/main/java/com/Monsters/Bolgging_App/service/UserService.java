package com.Monsters.Bolgging_App.service;

import com.Monsters.Bolgging_App.dto.UserDTO;

import java.util.List;

public interface UserService {
    UserDTO addUser(UserDTO userDto); //Create
    UserDTO findById(int id);
    List<UserDTO> findAll(); //Retrieve
    UserDTO updateUser(UserDTO userDto); //Update
    void deleteUser(int id); //Delete
}
