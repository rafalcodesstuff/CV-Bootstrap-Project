package com.example.cvproject;


import com.example.cvproject.model.Hero;
import com.example.cvproject.model.HeroProfession;
import com.example.cvproject.repository.HeroProfessionRepository;
import com.example.cvproject.repository.HeroRepository;
import com.example.cvproject.service.HeroService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
public class TestDatabase {

    @Autowired
    private HeroProfessionRepository heroProfessionRepository;

    @Autowired
    private HeroService heroService;

    @Test
    public void canGetHeroById() {
        System.out.println("Running Select Hero From Database Check");
        Hero result = heroService.getHeroById(1L);
        assertThat(result.getId()).isEqualTo(1);
    }
    @Test
    public void canGetHeroProfessionFromDatabase() {
        System.out.println("Running Select Profession From Database Check");
        Optional<HeroProfession> result = heroProfessionRepository.findById(1L);
        assertThat(result.isPresent()).isEqualTo(true);
    }

    @Test
    public void canGetHeroProfessionByHeroFeoriegnKey() {
        System.out.println("Running Select Profession By Hero Id Check");
        List<HeroProfession> result = heroProfessionRepository.getHeroProfessionsByHeroId(1L);
        System.out.println("Result: " + result);
        assertThat(result.size()).isEqualTo(4);
    }

    @Test
    public void isFormattedStrongCorrect() {
        Long id = 1L;
        String result = heroService.getFormattedHeroProfessions(id);
        assertThat(result).isEqualTo("Designer, Developer, Freelancer, Photographer");
    }
}

