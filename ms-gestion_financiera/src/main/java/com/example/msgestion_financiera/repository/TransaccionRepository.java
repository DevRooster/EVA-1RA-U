package com.example.msgestion_financiera.repository;

import com.example.msgestion_financiera.entity.Transaccion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransaccionRepository extends JpaRepository <Transaccion,Integer> {
}
