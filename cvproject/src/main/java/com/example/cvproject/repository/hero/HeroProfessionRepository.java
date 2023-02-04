package com.example.cvproject.repository.hero;

import com.example.cvproject.model.hero.HeroProfession;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeroProfessionRepository extends JpaRepository<HeroProfession, Long> {
    @Query(value = "SELECT p FROM HeroProfession p WHERE p.hero.id = :id")
    List<HeroProfession> getHeroProfessionsByHeroId(@Param("id") Long id);
}
