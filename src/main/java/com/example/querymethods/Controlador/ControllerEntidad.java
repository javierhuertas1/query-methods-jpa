package com.example.querymethods.Controlador;

import org.springframework.web.bind.annotation.RestController;

import com.example.querymethods.Entidades.Ejemplo;
import com.example.querymethods.Repo.EjemploRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class ControllerEntidad {

    @Autowired
    EjemploRepository ejemploRepository;

    @GetMapping("/encontrarEjemplos/{Nombre}")
    public Ejemplo getMethodName(@PathVariable("Nombre") String Variable) {
        
        Ejemplo ejemplo = ejemploRepository.findByNombre(Variable);

        return ejemplo;
    }
    


    
}
