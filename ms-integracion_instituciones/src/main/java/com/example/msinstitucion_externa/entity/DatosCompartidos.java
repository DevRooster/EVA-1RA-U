package com.example.msinstitucion_externa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class DatosCompartidos {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer institucionexternas_id;
    private Integer institucion;
    private String tipo_datos ;
    private String descripcion;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "otraugel_id")
    private List<OtraUGEL> Detalle_Otras_Ugeles;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "institucionexternas_id")
    private List<InstitucionExterna                                                         > Detalle_instituciones_externas;
}
