package com.example.mscomunicaciones_alertas.repository;

import com.example.mscomunicaciones_alertas.entity.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MensajeRepository extends JpaRepository <Mensaje,Integer> {
}
