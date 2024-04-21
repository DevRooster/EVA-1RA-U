package com.example.msgestion_eventos_actividades.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class Participante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String Apellido;
    private String Tipo;
    private String telefono;


    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "participantes")
    @JsonIgnoreProperties({"participantes_id"})
    private Set<Actividad> actividades = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "participantes")
    @JsonIgnoreProperties({"participantes_id"})
    private Set<Evento> eventos = new HashSet<>();
}
