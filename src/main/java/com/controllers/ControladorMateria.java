package main.java.com.controllers;

import main.java.com.model.Materia;


public class ControladorMateria {

    /**
     * Default constructor
     */
    public ControladorMateria() {
    }


    /**
     * @param nombre 
     * @param cargaHoraria
     * @param costo
     */
    public Materia nuevaMateria(String nombre, int cargaHoraria, float costo) {
        return new Materia(nombre,cargaHoraria,costo);
    }

}