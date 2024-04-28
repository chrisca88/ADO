package main.java.com.model;

import java.util.*;

/**
 * 
 */
public class PDF extends Reporte {

    private String nombre;

    /**
     * Default constructor
     */
    public PDF(String nombre) {
        this.nombre = nombre;
    }


    /**
     * @param cursosAsignados
     */
    public void imprimirReporte(List cursosAsignados) {
        System.out.println(cursosAsignados);
    }

}
