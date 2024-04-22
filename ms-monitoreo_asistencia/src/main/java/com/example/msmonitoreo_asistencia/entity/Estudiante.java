package com.example.msmonitoreo_asistencia.entity;

import com.example.msmonitoreo_asistencia.dto.AsignaturaDto;
import com.example.msmonitoreo_asistencia.dto.DocenteDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Estudiante {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;

    private String apellido ;
    private String grado ;
    private LocalDate fecha_nacimiento ;
    private String dirección ;
    private Integer asignaturaId;
    @Transient
    private AsignaturaDto asignaturaDto ;

}
