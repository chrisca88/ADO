package main.java.com.model;


import java.util.*;


public abstract class Reporte {
    private String nombreReporte;

    /**
     * Default constructor
     */
    public Reporte() {
    }


    /**
     * @param cursosAsignados
     */
    public abstract void imprimirReporte(List cursosAsignados);

}