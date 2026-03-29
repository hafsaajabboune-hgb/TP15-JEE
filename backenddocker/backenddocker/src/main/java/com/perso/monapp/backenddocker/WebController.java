package com.perso.monapp.backenddocker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("message", "L'application Spring Boot tourne dans Docker!");
        model.addAttribute("dbStatus", "MySQL connecte avec succes");
        model.addAttribute("appName", "Mon Application Docker");
        model.addAttribute("version", "v2.0");
        return "home";
    }

    @GetMapping("/hello-page")
    public String helloPage(Model model) {
        model.addAttribute("database", "MySQL connecte avec succes");
        model.addAttribute("message", "Bienvenue sur mon application Docker");
        model.addAttribute("status", "success");
        model.addAttribute("timestamp", java.time.LocalDateTime.now());
        return "hello";
    }
}