package com.example.userserver.service;

import com.example.userserver.dto.UserDTO;
import com.example.userserver.entity.User;

public interface UserService {

    void addUser(UserDTO dto);

}
