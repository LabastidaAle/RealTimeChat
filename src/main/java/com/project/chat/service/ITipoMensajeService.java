package com.project.chat.service;

import com.project.chat.models.TipoMensaje;

import java.util.Optional;

public interface ITipoMensajeService {
    Optional<TipoMensaje> findById(Integer id);

    Optional<TipoMensaje> findByTipo(String tipo);

    Optional <TipoMensaje> save(TipoMensaje tipoMensaje);

    long count();
}
