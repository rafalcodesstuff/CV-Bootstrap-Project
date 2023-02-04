package com.example.cvproject.model.about;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@RequiredArgsConstructor
@Getter
@Setter
public class About {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "about_description", length = 1000)
    private String aboutDescription;
    @Column(name = "position")
    private String position;
    @Column(name = "position_description")
    private String positionDescription;
    @Column(name = "birthday")
    private LocalDate birthday;
    @Column(name = "website")
    private String website;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city")
    private String city;
    @Column(name = "age")
    private Short age;
    @Column(name = "degree")
    private String degree;
    @Column(name = "email")
    private String email;
    @Column(name = "is_freelance")
    private boolean isFreelance;
    @Column(name = "main_description", length = 1000)
    private String mainDescription;
    @Column(name = "happy_clients")
    private Short happyClients;
    @Column(name = "projects")
    private Short projects;
    @Column(name = "hours_of_support")
    private Integer hoursOfSupport;
    @Column(name = "awards")
    private Short awards;

    @OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.REMOVE, mappedBy = "about")
    private List<Skills> skills;
}
