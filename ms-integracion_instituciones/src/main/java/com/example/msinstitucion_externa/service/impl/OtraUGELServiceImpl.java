package com.example.msinstitucion_externa.service.impl;

import com.example.msinstitucion_externa.entity.OtraUGEL;
import com.example.msinstitucion_externa.repository.OtraUGELRespository;
import com.example.msinstitucion_externa.service.OtraUGELService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OtraUGELServiceImpl implements OtraUGELService {
    @Autowired
    private OtraUGELRespository otraUGELRespository;

    @Override
    public List<OtraUGEL> lista() {
        return otraUGELRespository.findAll();
    }

    @Override
    public OtraUGEL guardar(OtraUGEL otraUGEL) {
        return otraUGELRespository.save(otraUGEL);
    }

    @Override
    public Optional<OtraUGEL> buscarPorId(Integer id) {
        return otraUGELRespository.findById(id);
    }

    @Override
    public OtraUGEL actualizar(OtraUGEL otraUGEL) {
        return otraUGELRespository.save(otraUGEL);
    }

    @Override
    public void eleminar(Integer id) {
        otraUGELRespository.deleteById(id);

    }
}
