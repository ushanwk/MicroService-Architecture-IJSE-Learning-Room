package com.example.userserver.controller;

import com.example.userserver.dto.UserDTO;
import com.example.userserver.entity.User;
import com.example.userserver.service.UserService;
import com.example.userserver.util.ResponseUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping(params = {"username", "password"})
    public boolean addUser(String username, String password){
        UserDTO dto = new UserDTO(username, password);
        userService.addUser(dto);
        return true;
    }

    @GetMapping
    public String getAllUser(){
        return "awaaa";
    }

    @PostMapping("passUser")
    public User passUserToItemService(@RequestBody User user){
        return restTemplate.postForObject("http://localhost:8082/item/editUser", user, User.class);
    }

}
