package com.example.msreportanalisis.service.Impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.msreportanalisis.entity.Notificacion;
import com.example.msreportanalisis.repository.NotificacionRepository;
import com.example.msreportanalisis.service.NotificacionService;

@Service
public class NotificacionServiceImpl implements NotificacionService{
    @Autowired
    private NotificacionRepository notificacionRepository;

    @Override
    public List<Notificacion> listar() {
        return notificacionRepository.findAll();
    }

    @Override
    public Notificacion guardar(Notificacion mensaje) {
        return notificacionRepository.save(mensaje);
    }

    @Override
    public Optional<Notificacion> buscarPorId(Integer id) {
        return notificacionRepository.findById(id);
    }

    @Override
    public Notificacion actualizar(Notificacion mensaje) {
        return notificacionRepository.save(mensaje);
    }

    @Override
    public void eliminar(Integer id) {
        notificacionRepository.deleteById(id);
    }
}
