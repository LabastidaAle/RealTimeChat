package com.project.chat.repository;

import com.project.chat.models.Conversacion;
import com.project.chat.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByNombreUsuario(String username);

    Optional<Usuario> findByEmailAndNombreUsuario(String email, String nombreUsuario);

    Optional<Usuario> findByNombreUsuarioAndPassword(String nombreUsuario, String password);
}
