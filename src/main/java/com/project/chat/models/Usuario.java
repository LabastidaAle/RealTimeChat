package com.project.chat.models;

public class Usuario {
    Integer id;
    String nombre;
    String correo;
    String nombreUsuario;
    String urlFotoPerfil;

    Usuario(){
    }

    public Usuario(Integer id, String nombre, String correo, String nombreUsuario, String urlFotoPerfil) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.nombreUsuario = nombreUsuario;
        this.urlFotoPerfil = urlFotoPerfil;
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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getUrlFotoPerfil() {
        return urlFotoPerfil;
    }

    public void setUrlFotoPerfil(String urlFotoPerfil) {
        this.urlFotoPerfil = urlFotoPerfil;
    }
}
