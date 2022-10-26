package com.example.demo.controllers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import com.example.demo.models.AlfabetoModel;
import com.example.demo.services.AlfabetoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/alfabeto")
public class AlfabetoController {
    @Autowired
    AlfabetoService alfabetoService;

    @GetMapping()
    public ArrayList<AlfabetoModel> obtenerLetras(){
    	

        return alfabetoService.obtenerLetras();
    }
    
    @GetMapping( path = "/{id}")
    public Optional<AlfabetoModel> obtenerLetraPorId(@PathVariable("id") Long id) {
        return this.alfabetoService.obtenerPorId(id);
    }

}