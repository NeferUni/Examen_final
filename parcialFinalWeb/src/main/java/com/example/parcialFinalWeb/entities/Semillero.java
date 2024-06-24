package com.example.parcialFinalWeb.entities;

import javax.persistence.*;

@Entity
@Table(name = "semillero")
public class Semillero {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String sigla;

    // Otros campos omitidos para brevedad

    // Getters y Setters
}
