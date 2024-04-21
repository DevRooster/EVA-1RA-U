package com.example.msadmatricula.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msadmatricula.entity.Curso;

public interface CursoRepository extends JpaRepository<Curso, Integer>{
    
}
