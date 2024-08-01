package com.project.chat.repository;

import com.project.chat.models.Mensaje;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface IMensajeRepository extends JpaRepository<Mensaje, Integer> {
    @Query("SELECT m from Mensaje m WHERE m.id =: chatId ORDER BY m.timestamp ASC")
    List<Mensaje> findMessageByChat(Integer chatId);



}
