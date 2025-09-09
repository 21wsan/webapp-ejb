package org.wsan.webapp.ejb.controller;

import jakarta.ejb.EJB;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.wsan.webapp.ejb.service.ServiceEjb;

import java.io.IOException;

@WebServlet("/index")
public class EjemploServlet extends HttpServlet {

    @EJB
    private ServiceEjb service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        req.setAttribute("saludo", service.saludar("Andres"));
        getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);
    }
}
