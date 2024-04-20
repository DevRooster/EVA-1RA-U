package com.example.mssoporteasistencia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Incidente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer solicitud_soporte_id;
    private String descripción;
    private String estado;
    private LocalDate fecha_creación;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "historialsoporte_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private HistorialSoporte historialSoporte;



}
