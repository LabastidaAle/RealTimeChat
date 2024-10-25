package com.project.chat.repository;

import com.project.chat.models.Conversacion;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IConversacionRepository extends JpaRepository<Conversacion, Integer> {
    List<Conversacion> findbyUsuarioId(Integer userId);
}
