package com.example.mssoporteasistencia.service.impl;



import com.example.mssoporteasistencia.entity.HistorialSoporte;
import com.example.mssoporteasistencia.repository.HistorialSoporteRepository;
import com.example.mssoporteasistencia.service.HistorialSoporteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HistorialSoporteServiceImpl implements HistorialSoporteService {
    @Autowired
    private HistorialSoporteRepository historialSoporteRepository;

    @Override
    public List<HistorialSoporte> lista() {
        return historialSoporteRepository.findAll();
    }

    @Override
    public HistorialSoporte guardar(HistorialSoporte historialSoporte) {
        return historialSoporteRepository.save(historialSoporte);
    }

    @Override
    public Optional<HistorialSoporte> buscarPorId(Integer id) {
        return historialSoporteRepository.findById(id);
    }

    @Override
    public HistorialSoporte actualizar(HistorialSoporte historialSoporte) {
        return historialSoporteRepository.save(historialSoporte);
    }

    @Override
    public void eleminar(Integer id) {
        historialSoporteRepository.deleteById(id);

    }
}
