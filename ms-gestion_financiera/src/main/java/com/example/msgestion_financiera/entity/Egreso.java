package com.example.msgestion_financiera.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Egreso {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String concepto;
    private String monto;
    private LocalDate fecha;
    private String descripcion;
    private Integer cuenta_id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cuenta_id")
    private List<Cuenta> detalles;
}


