package com.project.chat.service;

import com.project.chat.models.Conversacion;
import com.project.chat.models.Usuario;
import com.project.chat.repository.IUsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsuarioServiceImpl implements IUsuarioService{

    @Autowired
    private IUsuarioRepository iUsuarioRepository;

    @Override
    public List<Usuario> findAll() {
        return iUsuarioRepository.findAll();
    }

    @Override
    public Optional<Usuario> findById(Integer id) {
        return iUsuarioRepository.findById(id);
    }

    @Override
    public Usuario save(Usuario usuario) {
        return iUsuarioRepository.save(usuario);
    }

    @Override
    public Optional<Usuario> findByEmail(String email) {
        return iUsuarioRepository.findByEmail(email);
    }

    @Override
    public Optional<Usuario> findByNombreUsuario(String nombreusuario) {
        return iUsuarioRepository.findByNombreUsuario(nombreusuario);
    }

    @Override
    public Optional<Usuario> findByEmailAndNombreUsuario(String email, String nombreUsuario){
        return iUsuarioRepository.findByEmailAndNombreUsuario(email, nombreUsuario);
    }

    @Override
    public Optional<Usuario> findByNombreUsuarioAndPassword(String nombreUsuario, String password) {
        return iUsuarioRepository.findByNombreUsuarioAndPassword(nombreUsuario, password);
    }

    @Override
    public List<Conversacion> findConversacionesByUsuarioId(Integer id) {
        return iUsuarioRepository.findConversacionesByUsuarioId(id);
    }

    @Override
    public List<Usuario> findByConectadoTrue() {
        return iUsuarioRepository.findByConectadoTrue();
    }
}
