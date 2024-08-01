package com.project.chat.repository;

import com.project.chat.models.Conversacion;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IConversacionRepository extends JpaRepository<Conversacion, Integer> {
}
