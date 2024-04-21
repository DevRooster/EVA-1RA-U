package com.example.msgestion_financiera.repository;

import com.example.msgestion_financiera.entity.Egreso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EgresoRepository extends JpaRepository <Egreso,Integer> {
}
