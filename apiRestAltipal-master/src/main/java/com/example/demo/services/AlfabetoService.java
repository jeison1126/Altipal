package com.example.demo.services;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

import com.example.demo.models.AlfabetoModel;
import com.example.demo.repositories.AlfabetoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AlfabetoService {
    @Autowired
    AlfabetoRepository alfabetoRepository;
    
    public ArrayList<AlfabetoModel> obtenerLetras(){
    	ArrayList<String> list = new ArrayList<String>();
    	 Collections.sort(list);
        return (ArrayList<AlfabetoModel>) alfabetoRepository.findAll(); 
    }
    
    public Optional<AlfabetoModel> obtenerPorId(Long id){
        return alfabetoRepository.findById(id);
    }

    
}