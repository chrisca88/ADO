package main.java.com.controllers;

import main.java.com.model.*;


public class ControladorEstudiante {

    private static ControladorEstudiante instancia;

    /**
     * Default constructor
     */
    private ControladorEstudiante() {
    }

    public static  ControladorEstudiante getInstancia(){
        if (instancia == null)
            instancia = new ControladorEstudiante();
        return instancia;
    }


    /**
     * @param nombre
     * @param apellido
     * @param dni
     * @param legajo
     * @param carrera
     */
    public Estudiante nuevoEstudiante(String nombre, String apellido, String dni, String legajo, Carrera carrera) {
        return new Estudiante(nombre,apellido,dni,legajo,carrera);
    }

}