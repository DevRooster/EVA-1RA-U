package com.example.msmonitoreo_asistencia.feign;


import com.example.msmonitoreo_asistencia.dto.DocenteDto;
import com.example.msmonitoreo_asistencia.dto.OtrasUgelDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "ms-integracioninstituciones-service", path = "/otra_ugel")
public interface IntegracionInstitucionesFeign {
    @GetMapping("/{id}")
    ResponseEntity<OtrasUgelDto> buscarPorId(@PathVariable(required = true) Integer id) ;

}
