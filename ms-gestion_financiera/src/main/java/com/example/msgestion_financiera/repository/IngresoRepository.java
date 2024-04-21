package com.example.msgestion_financiera.repository;

import com.example.msgestion_financiera.entity.Ingreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngresoRepository extends JpaRepository <Ingreso,Integer> {
}
