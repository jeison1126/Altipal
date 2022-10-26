package com.example.demo.repositories;


import com.example.demo.models.AlfabetoModel;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlfabetoRepository extends JpaRepository<AlfabetoModel, Long> {
    
}

