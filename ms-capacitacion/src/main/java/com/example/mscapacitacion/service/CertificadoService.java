package com.example.mscapacitacion.service;

import com.example.mscapacitacion.entity.Certificado;
import java.util.List;
import java.util.Optional;

public interface CertificadoService {
    public List<Certificado> listar();
    
    public Certificado guardar(Certificado certificado);

    public Optional<Certificado> buscarPorId(Integer id);

    public Certificado actualizar(Certificado certificado);

    public void eliminar(Integer id);
}
