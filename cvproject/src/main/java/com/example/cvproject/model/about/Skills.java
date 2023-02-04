package com.example.cvproject.model.about;

import com.example.cvproject.model.about.About;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class Skills {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "skill_name")
    private String skillName;
    @Column(name = "progress")
    private Byte progress;

    @ManyToOne
    @JoinColumn(name = "about_id", nullable = false)
    private About about;
}
