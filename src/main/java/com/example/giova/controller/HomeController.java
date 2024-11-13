package com.example.giova.controller;

import org.springframework.stereotype.Controller; //biblioteca para hacer q esto se vuelva un controlador
import org.springframework.web.bind.annotation.GetMapping;  // permita usar get
 
 //el interés de un controller es simplemente hablar con el frontend, no tanto con la lógica, para la lógica está el service.
@Controller    //las anotaciones cambian el comportamiento de las clases
public class HomeController {
    
    @GetMapping("/")
    public String home(){
        return "home";  //será la pág. de inicio predeterminada.
    }
 
    @GetMapping("/login")
    public String login() {
        return "login";
    }
    //a cont. se crean tanto ese home como el login en la carpeta templates    
}
