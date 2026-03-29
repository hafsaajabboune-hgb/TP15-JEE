package com.perso.monapp.backenddocker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class TestController {

    // Endpoint 1: retourne du texte simple
    @GetMapping("/test")
    public String test() {
        return "L'application Spring Boot tourne dans Docker!";
    }

    // Endpoint 2: retourne du JSON
    @GetMapping("/hello")
    public Map<String, String> sayHello() {
        Map<String, String> response = new HashMap<>();
        response.put("message", "Bienvenue sur mon application Docker");
        response.put("status", "success");
        response.put("database", "MySQL connecte avec succes");
        return response;
    }
}