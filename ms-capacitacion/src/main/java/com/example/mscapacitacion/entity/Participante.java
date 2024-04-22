package com.example.mscapacitacion.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String apellido;
    private String email;

    // Relación con Curso (Muchos a Uno)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capcurso_id")
    private CapCurso capcurso;

}
