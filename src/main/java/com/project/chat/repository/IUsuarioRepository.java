package com.project.chat.repository;

import com.project.chat.models.Conversacion;
import com.project.chat.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface IUsuarioRepository extends JpaRepository<Usuario, Integer> {
    Optional<Usuario> findByEmail(String email);

    Optional<Usuario> findByNombreUsuario(String username);

    Optional<Usuario> findByEmailAndNombreUsuario(String email, String nombreUsuario);

    Optional<Usuario> findByNombreUsuarioAndPassword(String nombreUsuario, String password);

    List<Usuario> findByConectadoTrue();

    @Query("SELECT u.conversaciones FROM Usuario u WHERE u.id = :id")
    List<Conversacion> findConversacionesByUsuarioId(@Param("id") Integer id);


}
