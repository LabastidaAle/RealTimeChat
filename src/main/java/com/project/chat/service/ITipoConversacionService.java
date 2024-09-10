package com.project.chat.service;

import com.project.chat.models.TipoConversacion;

import java.util.Optional;

public interface ITipoConversacionService {
    Optional<TipoConversacion> findById(Integer id);

    Optional<TipoConversacion> findByTipo(String tipo);

    Optional<TipoConversacion> save(TipoConversacion tipoConversacion);

    long count();
}
