package com.example.msgestion_financiera.repository;

import com.example.msgestion_financiera.entity.Cuenta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CuentaRepository extends JpaRepository <Cuenta,Integer> {
}
