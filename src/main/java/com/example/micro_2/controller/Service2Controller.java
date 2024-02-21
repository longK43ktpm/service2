package com.example.micro_2.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;


@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "*")
public class Service2Controller {

    private static final String[] name = {"Lan", "Ngoc", "Nam"};

    @GetMapping("/service_2")
    public String[] getAll(){
        return name;
    }

}
