package com.example.msplanificacion_curricular.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Curso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nombre_Curso;
    private String Descripcion ;
    private String Duracion;
    private String Nivel_Educativo;



    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "cursos")
    @JsonIgnoreProperties({"cursos"})
    private Set<EstudianteCurso> estudiantes = new HashSet<>();

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "contenidocurricular_id")
    private List<ContenidoCurricular> detalleContenidocurricular;

    @OneToMany(mappedBy = "curso", cascade = CascadeType.ALL)
    @JsonIgnoreProperties({"curso"})
    private Set<DocenteCurso> docentes = new HashSet<>();
}
