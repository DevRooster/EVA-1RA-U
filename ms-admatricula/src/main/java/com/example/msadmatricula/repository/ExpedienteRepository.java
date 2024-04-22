package com.example.msadmatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msadmatricula.entity.Expediente;

public interface ExpedienteRepository extends JpaRepository<Expediente, Integer>{
    
}
