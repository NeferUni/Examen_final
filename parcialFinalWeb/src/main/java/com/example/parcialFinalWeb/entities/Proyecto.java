package com.example.parcialFinalWeb.entities;

import javax.persistence.*;

import lombok.Data;

@Entity
@Data
@Table(name = "proyecto")
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    // Otros campos omitidos para brevedad

    // Getters y Setters
}
