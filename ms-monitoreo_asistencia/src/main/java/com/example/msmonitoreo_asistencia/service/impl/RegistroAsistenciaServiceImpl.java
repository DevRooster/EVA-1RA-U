package com.example.msmonitoreo_asistencia.service.impl;


import com.example.msmonitoreo_asistencia.dto.DocenteDto;
import com.example.msmonitoreo_asistencia.dto.OtrasUgelDto;
import com.example.msmonitoreo_asistencia.entity.Estudiante;
import com.example.msmonitoreo_asistencia.entity.RegistroAsistencia;

import com.example.msmonitoreo_asistencia.feign.GestionDocenteFeign;
import com.example.msmonitoreo_asistencia.feign.IntegracionInstitucionesFeign;
import com.example.msmonitoreo_asistencia.repository.RegistroAsistenciaRepository;
import com.example.msmonitoreo_asistencia.service.RegistroAsistenciaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RegistroAsistenciaServiceImpl implements RegistroAsistenciaService {
    @Autowired
    private RegistroAsistenciaRepository registroAsistenciaRepository;

    @Autowired
    private GestionDocenteFeign gestionDocenteFeign;
    @Autowired
    private IntegracionInstitucionesFeign integracionInstitucionesFeign;

    @Override
    public List<RegistroAsistencia> lista() {
        return registroAsistenciaRepository.findAll();
    }

    @Override
    public RegistroAsistencia guardar(RegistroAsistencia registroAsistencia) {
        return registroAsistenciaRepository.save(registroAsistencia);
    }

    @Override
    public Optional<RegistroAsistencia> buscarPorId(Integer id)  {
        Optional<RegistroAsistencia> registroAsistencia = registroAsistenciaRepository.findById(id);
        DocenteDto docenteDto = gestionDocenteFeign.buscarPorId(registroAsistencia.get().getDocenteId()).getBody();
        List<Estudiante> estudiantes = registroAsistencia.get().getDetalleEstudiantes().stream().map(estudiante -> {
            estudiante.setOtrasUgelDto(integracionInstitucionesFeign.buscarPorId(estudiante.getOtrasUgelId()).getBody());
            return estudiante;
        }).toList();
        registroAsistencia.get().setDocenteDto(docenteDto);
        registroAsistencia.get().setDetalleEstudiantes(estudiantes);
        return registroAsistenciaRepository.findById(id);
    }

    @Override
    public RegistroAsistencia actualizar(RegistroAsistencia registroAsistencia) {
        return registroAsistenciaRepository.save(registroAsistencia);
    }

    @Override
    public void eleminar(Integer id) {
        registroAsistenciaRepository.deleteById(id);

    }
}
