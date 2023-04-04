package com.carlson.cwt.portrait.changerequestservice.controller;

import jdk.jshell.Snippet;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/direct")
public class Controller {

    @GetMapping("/hello")
    public String getString() {
        return "Hello";
    }

}
