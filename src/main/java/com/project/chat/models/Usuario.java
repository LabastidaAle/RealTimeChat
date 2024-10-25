package com.project.chat.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "usuarios")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private String email;
    private String nombreUsuario;

    @JsonIgnore
    private String password;

    private Boolean conectado;

    private String urlFotoPerfil;


    //Lista que almacenará la relación de los usuarios y sus multiples conversaciones
    @ManyToMany
    @JoinTable(
            name = "usuario_conversacion",       // Tabla intermedia y sus llaves
            joinColumns = @JoinColumn(name = "usuarioId"),
            inverseJoinColumns = @JoinColumn(name = "conversacionId")
    )

    @JsonIgnore
    private List<Conversacion> conversaciones;

    Usuario(){
    }

    public Usuario(Integer id, String nombre, String email, String nombreUsuario, String password, Boolean status, String urlFotoPerfil, List<Conversacion> conversaciones) {
        this.id = id;
        this.nombre = nombre;
        this.email = email;
        this.nombreUsuario = nombreUsuario;
        this.password = password;
        this.conectado = false;
        this.urlFotoPerfil = urlFotoPerfil;
        this.conversaciones = conversaciones;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getConectado() {
        return conectado;
    }

    public void setConectado(Boolean conectado) {
        this.conectado = conectado;
    }

    public String getUrlFotoPerfil() {
        return urlFotoPerfil;
    }

    public void setUrlFotoPerfil(String urlFotoPerfil) {
        this.urlFotoPerfil = urlFotoPerfil;
    }

    public List<Conversacion> getConversaciones() {
        return conversaciones;
    }

    public void setConversaciones(List<Conversacion> conversaciones) {
        this.conversaciones = conversaciones;
    }
}
