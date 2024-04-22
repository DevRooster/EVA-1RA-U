package com.example.msmonitoreo_asistencia.dto;

import lombok.Data;

import java.time.LocalDate;
@Data
public class DocenteDto {
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
