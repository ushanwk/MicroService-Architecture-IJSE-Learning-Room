package com.example.itemservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping
    public String getAllItem(){
        //call user
      return restTemplate.getForObject("http://localhost:8081/user", String.class);
    }

    @PostMapping("editUser")
    public User editUserAddress(@RequestBody User user){
        user.setUsername("UshanKaushalya");
        return user;
    }

}
