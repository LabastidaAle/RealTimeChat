package com.project.chat.repository;

import com.project.chat.models.TipoConversacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITipoConversacionRepository extends JpaRepository<TipoConversacion, Integer> {
}
