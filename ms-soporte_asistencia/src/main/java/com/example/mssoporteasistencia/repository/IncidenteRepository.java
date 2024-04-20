package com.example.mssoporteasistencia.repository;


import com.example.mssoporteasistencia.entity.Incidente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IncidenteRepository extends JpaRepository<Incidente,Integer> {
}
