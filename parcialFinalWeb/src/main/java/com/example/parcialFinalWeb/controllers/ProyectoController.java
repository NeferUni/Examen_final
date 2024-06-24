package com.example.parcialFinalWeb.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.parcialFinalWeb.entities.Proyecto;
import com.example.parcialFinalWeb.repositories.ProyectoRepository;

@RestController
@RequestMapping("/proyectos")
public class ProyectoController {

    @Autowired
    private ProyectoRepository proyectoRepository;

    @PostMapping
    public Proyecto createProyecto(@RequestBody Proyecto proyecto) {
        return proyectoRepository.save(proyecto);
    }
}
