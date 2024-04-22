package com.example.msmonitoreo_asistencia.feign;


import com.example.msmonitoreo_asistencia.dto.AsignaturaDto;
import com.example.msmonitoreo_asistencia.dto.DocenteDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-gestiondocentes-service", path = "/asignatura")
public interface AsignaturaFeign {
    @GetMapping("/{id}")
    ResponseEntity<AsignaturaDto> buscarPorId(@PathVariable(required = true) Integer id) ;

}
