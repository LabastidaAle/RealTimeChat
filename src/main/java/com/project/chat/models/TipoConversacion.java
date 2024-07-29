package com.project.chat.models;


import jakarta.persistence.*;

import java.util.List;

//Clase para indicar si el mensaje pertenece a un grupo o chat privado
@Entity
@Table (name = "tipoConversacion")
public class TipoConversacion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String tipo;

    @OneToMany(mappedBy = "tipoConversacion")
    private List<Conversacion> conversaciones;

    public TipoConversacion(){

    }

    public TipoConversacion(Integer id, String tipo) {
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

    public List<Conversacion> getConversaciones() {
        return conversaciones;
    }

    public void setConversaciones(List<Conversacion> conversaciones) {
        this.conversaciones = conversaciones;
    }
}
