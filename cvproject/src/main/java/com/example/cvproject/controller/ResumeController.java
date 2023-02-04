package com.example.cvproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ResumeController {

    @GetMapping("/resume")
    public String getResume() {
        return "resume/resume";
    }
}
