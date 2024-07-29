package com.project.chat.models;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

//Tabla que almacenará los datos de las distintas conversaciones de un usuario
@Entity
@Table
public class Conversacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    private Date fechaCreacion;
    private Date fechaActualización;

    public List<Usuario> getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(List<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

    //Esta lista almacenará todos los usuarios que participen en la conversacion,
    //Un usuario puede tener multiples conversaciones y a su vez esta puede constar de
    //multiples usuarios
    @ManyToMany(mappedBy = "conversaciones")
    private List<Usuario> usuarios;

    @ManyToOne
    private TipoConversacion tipoConversacion;

    @OneToMany(mappedBy = "conversacion")
    private List<Mensaje> mensajes;

    public Conversacion(){

    }

    public Conversacion(Integer id, String nombre, Date fechaCreacion, Date fechaActualización) {
        this.id = id;
        this.nombre = nombre;
        this.fechaCreacion = fechaCreacion;
        this.fechaActualización = fechaActualización;
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

    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public Date getFechaActualización() {
        return fechaActualización;
    }

    public void setFechaActualización(Date fechaActualización) {
        this.fechaActualización = fechaActualización;
    }

    public TipoConversacion getTipoConversacion() {
        return tipoConversacion;
    }

    public void setTipoConversacion(TipoConversacion tipoConversacion) {
        this.tipoConversacion = tipoConversacion;
    }
}
