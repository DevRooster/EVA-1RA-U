package com.example.mscapacitacion.entity;

import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class CapCurso {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String descripcion;
    private String instructor;
    private String duracion;

    // Relación con Participante (Uno a Muchos)
    @OneToMany(mappedBy = "capcurso", cascade = CascadeType.ALL)
    private List<Participante> participante;

    // Relación con Certificado (Uno a Uno)
    @OneToOne(mappedBy = "capcurso", cascade = CascadeType.ALL)
    private Certificado certificado;
}
