package com.mascota.mascota.controller;

import org.springframework.web.bind.annotation.RestController;

import com.mascota.mascota.model.UsuarioMascota;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class UsuarioMascotaContoller {
    private List<UsuarioMascota> usuariosMascota = new ArrayList<>();

    public UsuarioMascotaContoller() {
        usuariosMascota.add(new UsuarioMascota(1, "Pedro", "Peludo", 1, "Claudio"));
        usuariosMascota.add(new UsuarioMascota(2, "Patricio", "Astrid", 2, "Claudio"));
    }   
    @GetMapping("/UsuariosMascota")
    public List<UsuarioMascota> getUsuariosMascota() {
        return usuariosMascota;
    }
    @GetMapping("/UsuariosMascota/{id}")
    public UsuarioMascota getUsuMascById(@PathVariable int id) {
        for (UsuarioMascota usuarioMascota : usuariosMascota) {
            if (usuarioMascota.getId() == id) {
                return usuarioMascota;
            }
        }
        return null;
    }
    
}
