package org.wsan.webapp.ejb.service;

import jakarta.ejb.Stateless;

@Stateless
public class ServiceEjb {

    public String saludar(String nombre){
        return "hola que tal " + nombre;
    }
}
