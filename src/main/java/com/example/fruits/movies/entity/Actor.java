package com.example.fruits.movies.entity;

import com.example.fruits.movies.entity.Enums.Gender;
import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@Entity
@Table(name = "actor", schema = "fsweb")
public class Actor {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;
@Column (name = "first_name")
    private String firstName;
    @Column (name = "last_name")
    private String lastName;

    @Enumerated(EnumType.STRING)
    @Column (name = "gender")
    private Gender gender;

    @Column(name = "birth_date")
    Date birthDate;
}
