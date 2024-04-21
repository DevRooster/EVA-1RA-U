package com.example.msreportanalisis.entity;

import java.util.Date;
import java.util.List;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String contenido;
    private Date fechaEnvio;

    // Relación con Destinatario (Uno a Muchos)
    @OneToMany(mappedBy = "mensaje", cascade = CascadeType.ALL)
    private List<Destinatario> destinatario;

    // Relación con Notificación (Uno a Uno)
    @OneToOne(mappedBy = "mensaje", cascade = CascadeType.ALL)
    private Notificacion notificacion;
}