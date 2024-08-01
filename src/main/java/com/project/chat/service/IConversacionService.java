package com.project.chat.service;

import com.project.chat.models.Conversacion;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IConversacionService {

    @Query("SELECT c from Conversacion c WHERE ")
    List<Conversacion> getAllChatsbyUser(Integer userId);
}
