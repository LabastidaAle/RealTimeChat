package com.project.chat.controller;

import com.project.chat.models.Mensaje;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.http.HttpResponse;

@RestController
@RequestMapping("/api/v1/chat/m/")
public class MensajeController {

//    @PostMapping("/send")
//    public ResponseEntity<?> sendMessage(Mensaje msg){2
//        return ResponseEntity.ok().build();
//    }
}
