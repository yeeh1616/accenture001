package com.example.demo004.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/*
http://127.0.0.1:8080/bags
http://127.0.0.1:8080/bags?bagsNum=10
http://127.0.0.1:8080/bagsui

Add a bag:
http://127.0.0.1:8080/bags
-- in postman, select Body, raw and JSON, input the following data in Json:
{
    "applenum": 2,
    "supplier": "ROYAL_GALA",
    "time": "2022-09-24T20:10:02.890+00:00",
    "price": 5
}
* */

@RestController
public class UserRestController {
    @GetMapping("/")
    @ResponseStatus(HttpStatus.OK)
    public String hello(){
        return "hello";
    }
}
