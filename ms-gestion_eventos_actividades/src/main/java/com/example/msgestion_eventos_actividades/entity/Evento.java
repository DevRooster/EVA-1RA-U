package com.example.msgestion_eventos_actividades.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Evento {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nombre;
    private String Descripcion ;
    private LocalDate Fecha_Inicio;
    private LocalDate fecha_fin;
    private String Lugar;
    private String Tipo;
    private String Estado;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "EventoRecursoNecesario",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "recurso_id")
    )
    @JsonIgnoreProperties({"eventos"})
    private Set<RecursoNecesario> recursosNecesarios = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "EventoParticipante",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "participante_id")
    )
    @JsonIgnoreProperties({"eventos"})
    private Set<Participante> participantes = new HashSet<>();
}
