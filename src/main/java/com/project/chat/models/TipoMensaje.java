package com.project.chat.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "tipoMensaje")
public class TipoMensaje {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo;

    @OneToMany (mappedBy = "tipoMensaje")
    private List<Mensaje> mensajes;


    public TipoMensaje(){

    }

    public TipoMensaje(Integer id, String tipo) {
        this.id = id;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public List<Mensaje> getMensajes() {
        return mensajes;
    }

    public void setMensajes(List<Mensaje> mensajes) {
        this.mensajes = mensajes;
    }
}
