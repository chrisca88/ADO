package main.java.com.controllers;

import main.java.com.model.Docente;



public class ControladorDocente {

    private static ControladorDocente instancia;

    private ControladorDocente(){

    }
    /**
     * Default constructor
     */

    public static  ControladorDocente getInstancia(){
        if (instancia == null)
            instancia = new ControladorDocente();
        return instancia;
    }


    /**
     * @param nombre 
     * @param apellido 
     * @param dni 
     * @param legajo
     */
    public Docente nuevoDocente(String nombre,String apellido,String dni,String legajo) {

        return new Docente(nombre, apellido, dni, legajo);
    }

}