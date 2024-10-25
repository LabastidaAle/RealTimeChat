package com.project.chat.service;

import com.project.chat.models.Conversacion;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IConversacionService {
    List<Conversacion> findbyUsuarioId(Integer userId);
}
