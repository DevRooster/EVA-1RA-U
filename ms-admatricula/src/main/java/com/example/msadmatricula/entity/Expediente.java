package com.example.msadmatricula.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Expediente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "estudiante_id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private Estudiante estudiante;
    
    private String notas;
    private Double promedio;
}
