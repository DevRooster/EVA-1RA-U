package com.example.msgestion_eventos_actividades.repository;

import com.example.msgestion_eventos_actividades.entity.Actividad;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ActividadRepository extends JpaRepository<Actividad,Integer> {
}
