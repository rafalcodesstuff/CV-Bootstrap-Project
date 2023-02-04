package com.example.cvproject.controller;

import com.example.cvproject.service.HeroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private Long heroID = 1L;
    @Autowired
    private HeroService heroService;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("hero", heroService.getHeroById(heroID));
        model.addAttribute("heroProfessions", heroService.getFormattedHeroProfessions(heroID));
        return "index";
    }
}
