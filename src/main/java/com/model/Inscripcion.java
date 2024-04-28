package main.java.com.model;

import main.java.com.controllers.ControladorEstudiante;

import java.time.LocalDate;
import java.util.*;


public class Inscripcion {

    private Estudiante estudiante;
    private Curso curso;

    /**
     * Default constructor
     */
    public Inscripcion() {
    }


    /**
     * @param estudiante
     */
    public void inscribirEstudiante(Estudiante estudiante, Curso curso) {
        if (!validarCorrelativas(estudiante, curso.getMateria())) {
            System.out.println("El estudiante no cumple con las correlativas para inscribirse en este curso.");
            return;
        }
        if (!validarCargaHoraria(estudiante)) {
            System.out.println("El estudiante excede la carga horaria máxima permitida.");
            return;
        }
        if (curso.calcularCapacidad() <= 0) {
            System.out.println("El aula ya ha alcanzado su capacidad máxima. No es posible inscribir más estudiantes.");
            return;
        }
        LocalDate fechaActual = LocalDate.now();
        if (curso.getFecha().isBefore(fechaActual) || curso.getFecha().isEqual(fechaActual)) {
            estudiante.inscribirseCurso(estudiante, curso);
            System.out.println("El estudiante fue inscripto correctamente al curso.");
        } else {
            System.out.println("La fecha de inscripción ya ha pasado.");
        }
    }

    /**
     * @param materia
     */
    public boolean validarCorrelativas(Estudiante estudiante,Materia materia) {
        List<Materia> correlativasAnteriores = materia.getCorrelativasAnteriores();
        if (correlativasAnteriores == null || correlativasAnteriores.isEmpty()) {
            return true;
        }
        List<Materia> materiasAprobadas = estudiante.getMateriasAprobadas();
        for (Materia correlativa : correlativasAnteriores) {
            if (!materiasAprobadas.contains(correlativa)) {
                return false;
            }
        }
        return true;

    }

    /**
     * @param estudiante
     */
    public boolean validarCargaHoraria(Estudiante estudiante) {
        List <Curso> cursosInscriptos = estudiante.getCursosInscriptos();

        int cargaHorariaTotal = 0;
        for (Curso curso : cursosInscriptos) {
            cargaHorariaTotal += curso.getMateria().getCargaHoraria();
        }
        Carrera carrera = estudiante.getCarrera();
        int cargaHorariaMaxima = carrera.getCargaHorariaMaxima();

        return cargaHorariaTotal <= cargaHorariaMaxima;

    }

}