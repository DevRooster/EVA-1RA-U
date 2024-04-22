package com.example.msreportanalisis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msreportanalisis.entity.Destinatario;

public interface DestinatarioRepository extends JpaRepository<Destinatario, Integer>{
    
}
