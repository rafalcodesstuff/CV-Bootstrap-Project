package com.example.cvproject;

import com.example.cvproject.model.hero.HeroProfession;
import com.example.cvproject.repository.hero.HeroProfessionRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

@SpringBootTest
@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
class CvprojectApplicationTests {

    @Autowired
    private HeroProfessionRepository heroProfessionRepository;

    @Test
    void contextLoads() {

    }
    @Test
    public void getHeroProfessionsByHero_whenHeroIdExists_returnsListOfProfessions() {
        // Given
        HeroProfession heroProfession1 = new HeroProfession();
        heroProfession1.setId(1L);
        heroProfession1.setProfessionName("Warrior");
        HeroProfession heroProfession2 = new HeroProfession();
        heroProfession2.setId(1L);
        heroProfession2.setProfessionName("Archer");
        heroProfessionRepository.save(heroProfession1);
        heroProfessionRepository.save(heroProfession2);

        // When
        List<HeroProfession> result = heroProfessionRepository.getHeroProfessionsByHeroId(1L);

        // Then
        assertThat(result).hasSize(2);
        assertThat(result).extracting("profession").containsOnly("Warrior", "Archer");
    }

    @Test
    public void getHeroProfessionsByHero_whenHeroIdDoesNotExist_returnsEmptyList() {
        // When
        List<HeroProfession> result = heroProfessionRepository.getHeroProfessionsByHeroId(1L);

        // Then
        assertThat(result).isEmpty();
    }
}
