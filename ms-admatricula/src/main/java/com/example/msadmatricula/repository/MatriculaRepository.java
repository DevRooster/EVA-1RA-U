package com.example.msadmatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msadmatricula.entity.Matricula;

public interface MatriculaRepository extends JpaRepository<Matricula, Integer>{
    
}
