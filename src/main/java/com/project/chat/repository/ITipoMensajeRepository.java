package com.project.chat.repository;

import com.project.chat.models.TipoMensaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ITipoMensajeRepository extends JpaRepository<TipoMensaje, Integer> {
    Optional<TipoMensaje> findById(Integer id);
    Optional<TipoMensaje> findByTipo(String tipo);

    TipoMensaje save(TipoMensaje tipoMensaje);

    long count();
}
