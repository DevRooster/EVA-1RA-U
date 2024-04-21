package com.example.mspedido.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;
@Data
public class ProductoDto {
    private Integer id;
    private String nombre;
    private String descripcion;
    private BigDecimal precio;
    private LocalDate fecha_creacion;
    private LocalDate fecha_fin;

    private CatergoriaDto categoria;

}
