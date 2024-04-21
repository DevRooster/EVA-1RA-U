package com.example.msreportanalisis.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.msreportanalisis.entity.Notificacion;

public interface NotificacionRepository extends JpaRepository<Notificacion, Integer>{
    
}
