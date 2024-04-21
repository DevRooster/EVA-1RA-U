package com.example.mscapacitacion.service.Impl;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mscapacitacion.entity.Certificado;
import com.example.mscapacitacion.repository.CertificadoRepository;
import com.example.mscapacitacion.service.CertificadoService;

@Service
public class CertificadoServiceImpl implements CertificadoService{
    @Autowired
    private CertificadoRepository certificadoRepository;

    @Override
    public List<Certificado> listar() {
        return certificadoRepository.findAll();
    }

    @Override
    public Certificado guardar(Certificado certificado) {
        return certificadoRepository.save(certificado);
    }

    @Override
    public Optional<Certificado> buscarPorId(Integer id) {
        return certificadoRepository.findById(id);
    }

    @Override
    public Certificado actualizar(Certificado certificado) {
        return certificadoRepository.save(certificado);
    }

    @Override
    public void eliminar(Integer id) {
        certificadoRepository.deleteById(id);
    }
}
