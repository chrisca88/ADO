package main.java.com.model;

import java.util.*;

public class Docente {

    private String nombre;
    private String apellido;
    private String dni;
    private String legajo;
    private List<Curso> cursosAsignados;

    public Docente() {
    }

    /**
     * Default constructor
     */

    public Docente(String nombre, String apellido, String dni, String legajo) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
        this.cursosAsignados = new ArrayList<>();

    }

    public List<Curso> getCursosAsignados() {
       return cursosAsignados;
    }


    public void verCursosAsignados() {
        // TODO implement here
    }

    /**
     * @param nombreReporte 
     * @param cursosAsignados
     */
    public void generarReporte(String nombreReporte, List cursosAsignados) {
        PDF reportePDF = new PDF(nombreReporte);
        reportePDF.imprimirReporte(cursosAsignados);
    }

    /**
     * @param curso
     */
    public void agregarCurso(Curso curso) {
        getCursosAsignados().add(curso);
    }

    @Override
    public String toString() {
        return "Docente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}