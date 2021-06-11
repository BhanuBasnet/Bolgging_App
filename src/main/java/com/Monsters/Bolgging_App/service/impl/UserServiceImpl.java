package com.Monsters.Bolgging_App.service.impl;

import com.Monsters.Bolgging_App.dto.UserDTO;
import com.Monsters.Bolgging_App.model.User;
import com.Monsters.Bolgging_App.ripository.UserRepository;
import com.Monsters.Bolgging_App.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public UserDTO addUser(UserDTO userDto) {
        User user = new User(userDto);
        User savedUser =userRepository.save(user);
        UserDTO savedUserDTO = new UserDTO(savedUser);
        return savedUserDTO;
    }

    @Override
    public UserDTO findById(int id) {
        return null;
    }

    @Override
    public List<UserDTO> findAll() {
        List<User> users = userRepository.findAll();
        List<UserDTO> userDTOs =new ArrayList<>();
        for (User user : users){
            UserDTO userDTO =new UserDTO(user);
            userDTOs.add(userDTO);
        }
        return userDTOs;
    }

    @Override
    public UserDTO updateUser(UserDTO userDto) {
        return null;
    }

    @Override
    public void deleteUser(int id) {

    }
}
