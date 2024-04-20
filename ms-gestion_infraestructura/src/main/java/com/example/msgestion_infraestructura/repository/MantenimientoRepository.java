package com.example.msgestion_infraestructura.repository;

import com.example.msgestion_infraestructura.entity.Mantenimiento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MantenimientoRepository extends JpaRepository <Mantenimiento,Integer> {
}
