package com.example.msgestion_docentes.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Evaluación {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer id_docente;
    private Integer id_asignatura;
    private String Tipo;
    private LocalDate fecha_creación;
    private String Nota;




}
