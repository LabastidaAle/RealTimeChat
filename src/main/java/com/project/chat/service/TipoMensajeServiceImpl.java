package com.project.chat.service;

import com.project.chat.models.TipoMensaje;
import com.project.chat.repository.ITipoMensajeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoMensajeServiceImpl implements ITipoMensajeService{

    @Autowired
    private ITipoMensajeRepository tipoMensajeRepository;

    @Override
    public Optional<TipoMensaje> findById(Integer id) {
        return tipoMensajeRepository.findById(id);
    }

    @Override
    public Optional<TipoMensaje> findByTipo(String tipo) {
        return tipoMensajeRepository.findByTipo(tipo);
    }

    public Optional<TipoMensaje> save(TipoMensaje tipoMensaje){
        return Optional.ofNullable(tipoMensajeRepository.save(tipoMensaje));
    }

    @Override
    public long count() {
        return tipoMensajeRepository.count();
    }
}
