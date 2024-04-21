package com.example.msgestion_eventos_actividades.repository;

import com.example.msgestion_eventos_actividades.entity.Evento;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento,Integer> {
}
