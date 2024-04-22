package com.example.msmonitoreo_asistencia.entity;

import com.example.msmonitoreo_asistencia.dto.DocenteDto;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Data
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String nivel;
    private String grado;
    private String horario;
    private Integer docenteDtoId;

    @Transient
    private DocenteDto docenteDto ;


}
