package com.example.msinstitucion_externa.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class DatosCompartidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer ugel_id;
    private Integer institucion_id;
    private String tipo_datos ;
    private String descripcion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "otraugel_id")
    private OtraUGEL otraUGEL;
}
