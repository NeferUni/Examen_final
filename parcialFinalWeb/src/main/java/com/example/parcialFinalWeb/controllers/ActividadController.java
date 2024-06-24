package com.example.parcialFinalWeb.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.parcialFinalWeb.entities.Actividad;
import com.example.parcialFinalWeb.repositories.ActividadRepository;

@RestController
@RequestMapping("/actividades")
public class ActividadController {

    @Autowired
    private ActividadRepository actividadRepository;

    @PutMapping("/{id}")
    public Actividad updateActividad(@PathVariable Long id, @RequestBody Actividad actividad) {
        return actividadRepository.findById(id).map(a -> {
            a.setActividad(actividad.getActividad());
            return actividadRepository.save(a);
        }).orElse(null);
    }
}
