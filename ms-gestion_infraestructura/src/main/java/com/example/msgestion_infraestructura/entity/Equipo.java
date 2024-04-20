package com.example.msgestion_infraestructura.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Equipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String tipo;
    /*public enum EstadoEquipo {
        ACTIVO,
        INACTIVO,
        REPARACION,
        DESCARTADO
    }
     */
    private String estado;
    private LocalDate fecha_contruccion;
}