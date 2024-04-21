package com.example.msgestion_docentes.repository;


import com.example.msgestion_docentes.entity.Docente;

import org.springframework.data.jpa.repository.JpaRepository;

public interface DocenteRepository extends JpaRepository <Docente,Integer> {
}
