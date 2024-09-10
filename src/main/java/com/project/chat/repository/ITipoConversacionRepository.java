package com.project.chat.repository;

import com.project.chat.models.TipoConversacion;
import com.project.chat.models.TipoMensaje;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ITipoConversacionRepository extends JpaRepository<TipoConversacion, Integer> {
    Optional<TipoConversacion> findById(Integer id);

    Optional<TipoConversacion> findByTipo(String tipo);

    long count();

    TipoConversacion save(TipoConversacion tipoConversacion);
}
