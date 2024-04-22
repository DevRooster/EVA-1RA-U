package com.example.msmonitoreo_asistencia.entity;

import com.example.msmonitoreo_asistencia.dto.OtrasUgelDto;
import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

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
    private Integer otrasUgelId;
    @Transient
    private OtrasUgelDto otrasUgelDto ;

}
