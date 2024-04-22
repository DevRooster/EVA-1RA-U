package com.example.msgestion_infraestructura.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Mantenimiento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String tipo_mantenimiento;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private Integer equipo_id;

/* relacion de muchos a uno */
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "equipo_id")
    private List<Equipo> detalle;
}
