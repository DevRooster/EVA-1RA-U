package com.example.msgestion_financiera.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Cuenta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String nombre;
    private Integer numero;
    private Integer saldo;
    private LocalDate fecha_apertura;


}
