package com.example.parcialFinalWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.parcialFinalWeb.entities.Semillero;
import com.example.parcialFinalWeb.repositories.SemilleroRepository;

@RestController
@RequestMapping("/semilleros")
public class SemilleroController {

    @Autowired
    private SemilleroRepository semilleroRepository;

    @GetMapping("/{id}")
    public Semillero getSemilleroById(@PathVariable Long id) {
        return semilleroRepository.findById(id).orElse(null);
    }
}
