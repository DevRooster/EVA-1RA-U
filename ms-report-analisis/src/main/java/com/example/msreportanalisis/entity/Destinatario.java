package com.example.msreportanalisis.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Destinatario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String email;

    // Relación con Mensaje (Muchos a Uno)
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mensaje_id")
    private Mensaje mensaje;

    // Relación con Notificación (Uno a Uno)
    @OneToOne(mappedBy = "destinatario", cascade = CascadeType.ALL)
    private Notificacion notificacion;
}
