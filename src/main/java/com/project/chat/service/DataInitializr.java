package com.project.chat.service;

import com.project.chat.models.TipoConversacion;
import com.project.chat.models.TipoMensaje;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializr {
    private final ITipoMensajeService tipoMensajeService;

    private final ITipoConversacionService tipoConversacionService;

    @Autowired
    public DataInitializr(ITipoMensajeService tipoMensajeService, ITipoConversacionService tipoConversacionService) {
        this.tipoMensajeService = tipoMensajeService;
        this.tipoConversacionService = tipoConversacionService;
    }

    @PostConstruct
    public void crearTiposMensajes(){

        //Crear los tipos de mensajes que admite el chat
         if(tipoMensajeService.count() == 0){
             TipoMensaje texto = new TipoMensaje();
             texto.setTipo("texto");
             tipoMensajeService.save(texto);

             TipoMensaje audio = new TipoMensaje();
             audio.setTipo("audio");
             tipoMensajeService.save(audio);

             TipoMensaje imagen = new TipoMensaje();
             imagen.setTipo("imagen");
             tipoMensajeService.save(imagen);

             TipoMensaje video = new TipoMensaje();
             video.setTipo("video");
             tipoMensajeService.save(video);
         }

         //Definiendo tipos de chats admitidos
         if (tipoConversacionService.count() == 0){
             TipoConversacion privado = new TipoConversacion();
             privado.setTipo("privado");
             tipoConversacionService.save(privado);

             TipoConversacion grupal = new TipoConversacion();
             grupal.setTipo("grupo");
             tipoConversacionService.save(grupal);
         }
    }
}
