package com.example.mscapacitacion.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mscapacitacion.entity.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Integer>{
    
}
