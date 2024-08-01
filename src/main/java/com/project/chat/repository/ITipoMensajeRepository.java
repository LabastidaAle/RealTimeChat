package com.project.chat.repository;

import com.project.chat.models.TipoMensaje;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoMensajeRepository extends JpaRepository<TipoMensaje, Integer> {
}
