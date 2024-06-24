package com.example.parcialFinalWeb.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "actividad")
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String actividad;

    // Otros campos omitidos para brevedad

    // Getters y Setters
}
