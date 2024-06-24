package com.example.parcialFinalWeb.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.parcialFinalWeb.entities.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Long> {
}
