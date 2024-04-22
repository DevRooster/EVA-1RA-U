package com.example.msreportanalisis.service;

import com.example.msreportanalisis.entity.Notificacion;
import java.util.List;
import java.util.Optional;

public interface NotificacionService {
    public List<Notificacion> listar();
    
    public Notificacion guardar(Notificacion notificacion);

    public Optional<Notificacion> buscarPorId(Integer id);

    public Notificacion actualizar(Notificacion notificacion);

    public void eliminar(Integer id);
}
