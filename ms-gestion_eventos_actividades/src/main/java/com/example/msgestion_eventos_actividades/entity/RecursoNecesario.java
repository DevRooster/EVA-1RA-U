package com.example.msgestion_eventos_actividades.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
public class RecursoNecesario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String Descripcion;
    private String Cantidad;



    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "recursosNecesarios")
    @JsonIgnoreProperties({"recursosNecesarios"})
    private Set<Evento> eventos = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "recursosNecesarios")
    @JsonIgnoreProperties({"recursosNecesarios"})
    private Set<Actividad> actividades = new HashSet<>();

}
