package com.example.parcialFinalWeb.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.parcialFinalWeb.entities.Periodo;
import com.example.parcialFinalWeb.repositories.PeriodoRepository;

import java.util.List;

@RestController
@RequestMapping("/periodos")
public class PeriodoController {

    @Autowired
    private PeriodoRepository periodoRepository;

    @GetMapping
    public List<Periodo> getAllPeriodos() {
        return periodoRepository.findAll();
    }
}
