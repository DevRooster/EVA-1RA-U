package com.example.mscomunicaciones_alertas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Mensaje {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String remitente;
    private String destinario;
    private String asunto;
    private String contenido;
    private LocalDate fecha_envio;
    private String leido;
}
