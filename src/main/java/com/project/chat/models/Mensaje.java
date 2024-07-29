package com.project.chat.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table (name = "mensajes")
public class Mensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String mensaje;
    private Date Fecha;
    private String url;

    // Las siguientes variables declaran los objetos relacionadas a las tablas referenciados
    // en las llaves foraneas contenidos dentro de la entidad mensaje,
    // La anotacion ManytoOne hace referencia a que estos onjetos pueden estar relacionados con
    // multiples mensajes pero un mensaje solo puede pertenecer a uno de estos
    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Conversacion conversacion;

    @ManyToOne
    private TipoMensaje tipoMensaje;

    public Mensaje(){
    }

    public Mensaje(Integer id, String mensaje, Date fecha, String url, Usuario usuario, Conversacion conversacion, TipoMensaje tipoMensaje) {
        this.id = id;
        this.mensaje = mensaje;
        Fecha = fecha;
        this.url = url;
        this.usuario = usuario;
        this.conversacion = conversacion;
        this.tipoMensaje = tipoMensaje;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public Date getFecha() {
        return Fecha;
    }

    public void setFecha(Date fecha) {
        Fecha = fecha;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Conversacion getConversacion() {
        return conversacion;
    }

    public void setConversacion(Conversacion conversacion) {
        this.conversacion = conversacion;
    }

    public TipoMensaje getTipoMensaje() {
        return tipoMensaje;
    }

    public void setTipoMensaje(TipoMensaje tipoMensaje) {
        this.tipoMensaje = tipoMensaje;
    }
}
