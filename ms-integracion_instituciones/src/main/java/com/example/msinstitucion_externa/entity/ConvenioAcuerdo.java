package com.example.msinstitucion_externa.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class ConvenioAcuerdo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer institucion_id;
    private Integer ugel_id;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "otraugel_id")
    private OtraUGEL otraUGEL;


}
