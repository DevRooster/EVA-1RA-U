package com.example.mscomunicaciones_alertas.repository;

import com.example.mscomunicaciones_alertas.entity.Alerta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlertaRepository extends JpaRepository <Alerta,Integer> {
}
