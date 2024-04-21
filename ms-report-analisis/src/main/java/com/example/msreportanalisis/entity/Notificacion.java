package com.example.msreportanalisis.entity;

import java.util.Date;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Notificacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String estado;
    private Date fechaNotificacion;

    // Relación con Mensaje (Uno a Uno)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mensaje_id")
    private Mensaje mensaje;

    // Relación con Destinatario (Uno a Uno)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "destinatario_id")
    private Destinatario destinatario;
}
