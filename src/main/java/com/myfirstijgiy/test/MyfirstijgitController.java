package com.myfirstijgiy.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyfirstijgitController {

    @GetMapping("/welcom-message")
    public String welcomeMessage(){
        return "Welcome, My first IJ Git Test project";
    }
}
