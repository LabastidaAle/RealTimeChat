package com.project.chat.service;

import com.project.chat.models.TipoConversacion;
import com.project.chat.repository.ITipoConversacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class TipoConversacionServiceImpl implements ITipoConversacionService{

    @Autowired
    private ITipoConversacionRepository tipoConversacionRepository;

    @Override
    public Optional<TipoConversacion> findById(Integer id) {
        return tipoConversacionRepository.findById(id);
    }

    @Override
    public Optional<TipoConversacion> findByTipo(String tipo) {
        return tipoConversacionRepository.findByTipo(tipo);
    }

    @Override
    public Optional<TipoConversacion> save(TipoConversacion tipoConversacion) {
        return Optional.ofNullable(tipoConversacionRepository.save(tipoConversacion));
    }

    @Override
    public long count() {
        return tipoConversacionRepository.count();
    }
}
