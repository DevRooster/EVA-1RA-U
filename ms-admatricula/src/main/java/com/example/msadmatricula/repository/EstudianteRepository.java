package com.example.msadmatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msadmatricula.entity.Estudiante;

public interface EstudianteRepository extends JpaRepository<Estudiante, Integer>{
    
}
