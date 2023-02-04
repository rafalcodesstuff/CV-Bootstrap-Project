package com.example.cvproject.service;

import com.example.cvproject.repository.about.AboutRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AboutService {
    private final AboutRepository aboutRepository;

//    public String getAboutDescriptionByUserId(Long id) {
//        aboutRepository.findAllById(id);
//    }
}
