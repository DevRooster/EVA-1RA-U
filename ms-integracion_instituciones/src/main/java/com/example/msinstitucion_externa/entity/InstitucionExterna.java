package com.example.msinstitucion_externa.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class InstitucionExterna {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String Tipo_Institución;
    private String direccion ;
    private String telefono ;
    private String correo_electronico;



    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "convenio_id")
    private List<ConvenioAcuerdo> Detalle_Convenio_acuerdo;
}
