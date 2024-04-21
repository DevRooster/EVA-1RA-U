package com.example.mscomunicaciones_alertas.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Alerta {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)

    private Integer id;
    private String tipo;
    /* public enum tipo {
        emergencia,
        informativa,
        recordatorio,
        etc
    }
     */
    private String contenido;
    private LocalDate fecha;
}
