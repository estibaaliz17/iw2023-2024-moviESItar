package com.example.crudrapido.entity;

import lombok.Data;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDate;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;

@Data
@Entity
@Table(name = "user")
public class User{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false, unique = true)
    private Long id;
    @Column(name = "name", nullable = false, length = 100)
    private String name;
    @Column(name = "description", nullable = false, length = 100)
    private String description;
    @Column(name = "birth_date", nullable = false)
    private LocalDate birth_date;

}