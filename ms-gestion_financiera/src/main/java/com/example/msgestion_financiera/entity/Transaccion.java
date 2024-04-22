package com.example.msgestion_financiera.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Entity
public class Transaccion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Integer id;
    private String tipo;
    private Number monto;
    private LocalDate fecha;
    private String descripcion;
    private Integer cuenta_origen_id;
    private Integer cuenta_destino_id;

    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinColumn(name = "cuenta_destino_id")
    private List<Cuenta> detalle;
}
