package com.SotoWeb.ProyectoCiclo3.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controladorgeneral {

    @GetMapping
    public String saludo(){
        return "Este es mi primer proyecto en la web";
    }

}
