package com.example.parcialFinalWeb.repositories;

import com.example.parcialFinalWeb.entities.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
