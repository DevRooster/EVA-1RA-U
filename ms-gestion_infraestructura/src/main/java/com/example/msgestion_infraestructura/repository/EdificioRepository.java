package com.example.msgestion_infraestructura.repository;

import com.example.msgestion_infraestructura.entity.Edificio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EdificioRepository extends JpaRepository <Edificio,Integer> {
}
