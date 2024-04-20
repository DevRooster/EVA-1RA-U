package com.example.mssoporteasistencia.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class SolicitudSoporte {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String título ;
    private String descripción ;
    private String estado ;
    private String prioridad;
    private LocalDate fecha_creación ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "incidente_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Incidente incidente;

}
