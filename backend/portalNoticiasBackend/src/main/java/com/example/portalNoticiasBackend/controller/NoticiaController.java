package com.example.portalNoticiasBackend.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1")
public class NoticiaController {
    
    @GetMapping("/hello")
    public String hello(){
        return "Olá";
    }
    
}
