package com.example.cvproject.controller;

import com.example.cvproject.service.AboutService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class AboutController {

    private final AboutService aboutService;

    @GetMapping("/about")
    public String getAbout(Model model) {
//        model.addAttribute("aboutDescription", aboutService.)
        return "about/about";
    }
}
