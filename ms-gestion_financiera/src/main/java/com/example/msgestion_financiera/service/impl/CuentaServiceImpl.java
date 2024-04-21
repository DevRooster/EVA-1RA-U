package com.example.msgestion_financiera.service.impl;

import com.example.msgestion_financiera.entity.Cuenta;
import com.example.msgestion_financiera.repository.CuentaRepository;
import com.example.msgestion_financiera.service.CuentaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CuentaServiceImpl implements CuentaService {

    @Autowired
    private CuentaRepository cuentaRepository;

    @Override
    public List<Cuenta> lista() {
        return cuentaRepository.findAll();
    }

    @Override
    public Cuenta guardar(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    @Override
    public Optional<Cuenta> buscarPorId(Integer id) {
        return cuentaRepository.findById(id);
    }

    @Override
    public Cuenta actualizar(Cuenta cuenta) {
        return cuentaRepository.save(cuenta);
    }

    @Override
    public void eliminar(Integer id) {
        cuentaRepository.deleteById(id);

    }
}
