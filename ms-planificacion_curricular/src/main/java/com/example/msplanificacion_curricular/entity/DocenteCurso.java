package com.example.msplanificacion_curricular.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class DocenteCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer id_docente;
    private Integer id_curso;
    private String Año_Academico;
    private LocalDate Periodo_Academico;
    private String observaciones  ;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "curso_id") // Asegúrate de que este sea el nombre correcto de la columna en tu base de datos
    private Curso curso;
}
