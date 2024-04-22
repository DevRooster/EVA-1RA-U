package com.example.msmonitoreo_asistencia.entity;

import com.example.msmonitoreo_asistencia.dto.DocenteDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class RegistroAsistencia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer DocenteId;
    private Integer estudiante_id;
    private Integer clase_id;
    private String estado_asistencia;
    private LocalDate fecha_asistencia;
    private String observaciones  ;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "clase_id")
    private List<Clase> detalleClase;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "clase_id")
    private List<Estudiante> detalleEstudiantes;

    @Transient
    private DocenteDto docenteDto ;
}
