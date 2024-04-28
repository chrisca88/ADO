package main.java.com.controllers;

import main.java.com.model.Aula;
import main.java.com.model.Curso;
import main.java.com.model.Materia;


public class ControladorCurso {

    /**
     * Default constructor
     */
    public ControladorCurso() {
    }


    /**
     * @param numero
     * @param aula
     * @param horario
     * @param materia
     */
    public Curso crearCurso(int numero ,Aula aula, String horario, Materia materia) {
        return new Curso(numero,aula,horario,materia);
    }



}