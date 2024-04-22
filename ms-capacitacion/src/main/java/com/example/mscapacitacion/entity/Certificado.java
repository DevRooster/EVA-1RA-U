package com.example.mscapacitacion.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Certificado {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String numero;
    private Date fechaEmision;

    // Relación con Curso (Uno a Uno)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capcurso_id")
    private CapCurso capcurso;
}
