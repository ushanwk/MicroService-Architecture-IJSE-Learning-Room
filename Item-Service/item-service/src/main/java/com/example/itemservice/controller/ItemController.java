package com.example.itemservice.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    @GetMapping
    public boolean getAllItem(){
        return true;
    }

}
