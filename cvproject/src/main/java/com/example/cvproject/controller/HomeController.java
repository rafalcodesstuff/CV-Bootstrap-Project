package com.example.cvproject.controller;

import com.example.cvproject.Globals;
import com.example.cvproject.service.HeroService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class HomeController {
    private final PasswordEncoder passwordEncoder;
    private final HeroService heroService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("hero", heroService.getHeroById(Globals.HERO_ID));
        model.addAttribute("heroProfessions", heroService.getFormattedHeroProfessions(Globals.HERO_ID));
        return "index";
    }
}
