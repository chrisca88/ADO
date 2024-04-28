package main.java.com.controllers;

import main.java.com.model.Curso;
import main.java.com.model.Estudiante;
import main.java.com.model.Inscripcion;

public class ControladorInscripcion {

    private static ControladorInscripcion instancia;

    /**
     * Default constructor
     */

    public static  ControladorInscripcion getInstancia(){
        if (instancia == null)
            instancia = new ControladorInscripcion();
        return instancia;
    }

    public void InscirpcionEstudiante(Estudiante estudiante, Curso curso){
        Inscripcion inscripcion = new Inscripcion();
        inscripcion.inscribirEstudiante(estudiante,curso);
    }

}