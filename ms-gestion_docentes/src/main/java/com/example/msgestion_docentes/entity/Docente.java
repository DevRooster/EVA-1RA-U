package com.example.msgestion_docentes.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Docente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String Nombre;
    private String Apellido;
    private LocalDate Fecha_Nacimiento;
    private String Género;
    private String CorreoElectronico;
    private String Teléfono;
    private String Dirección;
    private String Especialidad;
    private String ExperienciaLaboral;
    private LocalDate Fecha_Contratación;
    private String Estado;







}
