package com.note.note.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/")
public class UsuarioController {

    @GetMapping(value = "/dashboard")
    public String dashboard() {
        return "usuario/dashboard";
    }
}
