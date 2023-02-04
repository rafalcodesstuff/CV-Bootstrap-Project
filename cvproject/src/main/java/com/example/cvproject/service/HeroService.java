package com.example.cvproject.service;

import com.example.cvproject.model.Hero;
import com.example.cvproject.model.HeroProfession;
import com.example.cvproject.repository.HeroProfessionRepository;
import com.example.cvproject.repository.HeroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class HeroService {

    @Autowired
    private HeroRepository heroRepository;
    @Autowired
    private HeroProfessionRepository professionRepository;

    public Hero getHeroById(Long id) {
        return heroRepository.findById(id).orElse(null);
    }

    public void createHero(String name) {
        Hero h = new Hero();
        h.setName(name);
        heroRepository.save(h);
    }

    public List<HeroProfession> getHeroProfessions(Long heroID) {
        return professionRepository.getHeroProfessionsByHeroId(heroID);
    }

    public String getFormattedHeroProfessions(Long heroID) {
        return '"' +
                getHeroProfessions(heroID).stream()
                .map(profession -> profession.getProfessionName())
                .collect(Collectors.joining(", "))
                + '"';
    }

    public void createHeroProfession(String name, Hero hero) {
        HeroProfession p = new HeroProfession();
        p.setProfessionName(name);
        p.setHero(hero);
        professionRepository.save(p);
    }
}
