package main.java.com.controllers;

import main.java.com.model.*;

import java.util.*;


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
    public void agregarEstudiante(Estudiante estudiante) {
        //estudiantes.add(estudiante);
    }
//    public void inscribirseCurso(ControladorEstudiante estudiante, Curso curso) {
//        estudiante.getCursosInscriptos().add(curso);
//    }

    public List<Curso> CursosInscriptos(Estudiante estudiante){
        return estudiante.getCursosInscriptos();
    }

//    public void pagarCuota(int numero){
//        float montoCuota = 0;
//        for (Curso curso : instancia.getCursosInscriptos()) {
//            montoCuota += curso.getMateria().getCosto();
//        }
//
//        Cuota cuota = new Cuota(numero, montoCuota);
//
//        IMetodoDePago metodoDePago = new MercadoPago();
//        metodoDePago.pagarCuota(cuota);
//
//    }

//    public Estudiante obtenerEstudiantePorLegajo(String legajo) {
//        for (Estudiante estudiante : estudiantes) {
//            if (estudiante.getLegajo().equals(legajo)) {
//                return estudiante;
//            }
//        }
//        return null;
//    }

}