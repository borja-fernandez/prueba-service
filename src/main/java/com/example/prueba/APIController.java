package com.example.prueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class APIController {

    public static final String TEXTO = "Esto es una prueba";

    @GetMapping("/prueba")
    public String getPrueba(){
        Date hoy = new Date();
        System.out.println(hoy.toString() + TEXTO);
        return TEXTO;
    }
}
