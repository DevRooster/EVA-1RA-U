package com.example.msplanificacion_curricular.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class ContenidoCurricular {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer curso_id;
    private Integer Plan_Estudios_id;
    private String Unidad_Curricular;
    private String Objetivos;
    private String Temas;
    private String Recursos_Didacticos;


    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "curso_id")
    private List<Curso> Detalle_Curso;


    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "Plan_Estudios_id")
    private List<PlanEstudios> Detalle_Plan_Estudios;
}
