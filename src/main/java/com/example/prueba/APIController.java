package com.example.prueba;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIController {

    public static final String TEXTO = "Esto es una prueba";

    @GetMapping("/prueba")
    public String getPrueba(){
        System.out.println(TEXTO);
        return TEXTO;
    }
}
