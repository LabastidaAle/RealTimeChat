package com.project.chat.service;

import com.project.chat.models.Conversacion;
import com.project.chat.repository.IConversacionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConversacionServiceImpl implements IConversacionService{
    @Autowired
    private IConversacionRepository iConversacionRepository;

    @Override
    public List<Conversacion> findbyUsuarioId(Integer userId) {
        return iConversacionRepository.findbyUsuarioId(userId);
    }
}
