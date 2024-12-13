package dev.java10x.cadastroDeNinjas.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
public class Controller {


    @GetMapping("/ola")
    public String boasvindas(){
        return "Ola";
    }

}
