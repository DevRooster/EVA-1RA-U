package com.example.msinstitucion_externa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class ConvenioAcuerdo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer otraugel_id;
    private LocalDate fecha_inicio;
    private LocalDate fecha_fin;
    private String descripcion;


    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "otraugel_id")
    private List<OtraUGEL> Detalle_Otras_Ugeles;


}
