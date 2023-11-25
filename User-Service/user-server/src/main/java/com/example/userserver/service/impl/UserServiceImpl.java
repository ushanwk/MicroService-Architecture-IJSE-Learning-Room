package com.example.userserver.service.impl;

import com.example.userserver.dto.UserDTO;
import com.example.userserver.entity.User;
import com.example.userserver.repo.UserRepo;
import com.example.userserver.service.UserService;
import jakarta.transaction.Transactional;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.ModelMap;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    UserRepo userRepo;

    @Autowired
    ModelMapper modelMapper;

    @Override
    public void addUser(UserDTO dto) {
        User user = modelMapper.map(dto, User.class);
        userRepo.save(user);
    }
}
