package com.example.msgestion_eventos_actividades.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
public class Actividad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nombre;
    private String Descripcion;
    private LocalDate Fecha_Inicio;
    private LocalDate Fecha_Fin;
    private String Lugar;
    private String Tipo;
    private String Estado;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "ActividadRecursoNecesario",
            joinColumns = @JoinColumn(name = "actividad_id"),
            inverseJoinColumns = @JoinColumn(name = "recurso_id")
    )
    @JsonIgnoreProperties({"actividades"})
    private Set<RecursoNecesario> recursosNecesarios = new HashSet<>();

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "ActividadParticipante",
            joinColumns = @JoinColumn(name = "actividad_id"),
            inverseJoinColumns = @JoinColumn(name = "participante_id")
    )
    @JsonIgnoreProperties({"actividades"})
    private Set<Participante> participantes = new HashSet<>();
}
