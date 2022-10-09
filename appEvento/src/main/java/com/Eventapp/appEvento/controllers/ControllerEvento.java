package com.Eventapp.appEvento.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ControllerEvento {
    @RequestMapping("/evento")
    public String formulariocadastro()
    {
        return "Eventos/evento";
    }
}
