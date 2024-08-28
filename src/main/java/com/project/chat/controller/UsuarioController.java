package com.project.chat.controller;

import com.project.chat.models.Usuario;
import com.project.chat.service.IUsuarioService;
import jakarta.servlet.http.HttpSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1/chat/")
public class UsuarioController {
    private final Logger logger= LoggerFactory.getLogger(UsuarioController.class);

    //BCryptPasswordEncoder passEncode= new BCryptPasswordEncoder();
    //Para encriptar la contraseña al transferir los datos
    //BCryptPasswordEncoder passEncode= new BCryptPasswordEncoder();

    @Autowired
    private IUsuarioService usuarioService;

    @GetMapping("/")
    public String home(){
        return "Bienvenido";
    }


    @PostMapping("/registro")
    public ResponseEntity<?> save(Usuario usuario) {
        logger.info("Registrando a: {}", usuario.getNombreUsuario());

        Optional<Usuario> user = usuarioService
                .findByEmailAndNombreUsuario(usuario.getEmail(), usuario.getNombreUsuario());

        if (user.isEmpty()){
            usuarioService.save(usuario);
            return ResponseEntity.ok().body("Registro exitoso");
        } else{
            return ResponseEntity.status(HttpStatus.CONFLICT)
                    .body("El usuario con el correo electrónico o nombre de usuario ya está registrado.");
        }
    }

    @PostMapping("/ingresar")
    public ResponseEntity<?> login(Usuario usuario, HttpSession sesion){
        Optional<Usuario> user = usuarioService
                .findByNombreUsuarioAndPassword(usuario.getNombreUsuario(), usuario.getPassword());

        if (user.isPresent()){
            sesion.setAttribute("idUsuario", user.get().getId());
            logger.info("Usuario no. {} ha ingresado", sesion.getAttribute("idUsuario"));
            return ResponseEntity.ok().body("Bienvenido");
        } else {
            return ResponseEntity.status(HttpStatus.UNAUTHORIZED)
                .body("El usuario o contraseña son incorrectos. Intente nuevamente");
        }
    }

    @GetMapping("/cerrar-sesion")
    public ResponseEntity<?> logout(HttpSession sesion){
        sesion.removeAttribute("idusuario");
        return ResponseEntity.ok().body("Sesion finalizada");
    }
}
