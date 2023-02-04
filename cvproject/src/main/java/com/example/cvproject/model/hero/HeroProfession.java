package com.example.cvproject.model.hero;

import com.example.cvproject.model.hero.Hero;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class HeroProfession {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "profession_name")
    private String professionName;

    @ManyToOne
    @JoinColumn(name = "hero_id", nullable = false)
    private Hero hero;
}
