package com.example.mscomunicaciones_alertas.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Data
@Entity
public class MiembroGrupo {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private Integer usuario_id;
    private  Integer grupo_id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "grupo_id")
    private List<Grupo> detalles;
}
