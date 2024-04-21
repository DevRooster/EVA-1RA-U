package com.example.msreportanalisis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msreportanalisis.entity.Mensaje;

public interface MensajeRepository extends JpaRepository<Mensaje, Integer>{
    
}
