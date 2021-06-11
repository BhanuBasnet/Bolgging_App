package com.Monsters.Bolgging_App.controller;

import com.Monsters.Bolgging_App.dto.UserDTO;
import com.Monsters.Bolgging_App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping
    public UserDTO addUser(@RequestBody UserDTO userDTO){
        return userService.addUser(userDTO);
    }

    @GetMapping
    public List<UserDTO> getAll(){
        return userService.findAll();
    }

}
