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
     * @param Aula 
     * @param horario
     * @param Materia
     */
    public Curso crearCurso(int numero,Aula Aula, String horario, Materia Materia) {
        Curso curso = new Curso(numero,Aula,horario,Materia);
        return curso;
    }



}