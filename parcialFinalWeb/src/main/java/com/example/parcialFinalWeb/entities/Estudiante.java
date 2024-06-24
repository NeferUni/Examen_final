package com.example.parcialFinalWeb.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "estudiante")
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String codigo;
    private String nombre;
    private String email;
    private String telefono;
    private Date fechaNacimiento;
    private String direccion;

    // Getters y Setters
}
