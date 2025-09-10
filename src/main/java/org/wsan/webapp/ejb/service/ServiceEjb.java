package org.wsan.webapp.ejb.service;

import jakarta.ejb.Stateful;
import jakarta.ejb.Stateless;
import jakarta.enterprise.context.RequestScoped;

@RequestScoped
@Stateful
public class ServiceEjb {

    private int contador;

    public String saludar(String nombre) {
        System.out.println("Imprimiendo dentro del ejb con instancia: " + this);
        contador++;
        System.out.println("valor del contador en el metodo saludar: " + contador);
        return "hola que tal " + nombre;
    }
}
