package com.project.chat.service;

import com.project.chat.models.TipoMensaje;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DataInitializr {
    private final ITipoMensajeService tipoMensajeService;

    @Autowired
    public DataInitializr(ITipoMensajeService tipoMensajeService) {
        this.tipoMensajeService = tipoMensajeService;
    }

    @PostConstruct
    public void crearTiposMensajes(){
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
    }
}
