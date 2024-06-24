package com.example.parcialFinalWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.parcialFinalWeb.repositories.EventoRepository;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoRepository eventoRepository;

    @DeleteMapping("/{id}")
    public void deleteEvento(@PathVariable Long id) {
        eventoRepository.deleteById(id);
    }
}
