package main.java.com.model;

import java.util.*;

public class Carrera {

    private String nombre;
    private int cargaHorariaMaxima;
    private List<Materia> materias;

    /**
     * Default constructor
     */
    public Carrera(String nombre, int cargaHorariaMaxima, Materia materia) {
        this.nombre = nombre;
        this.cargaHorariaMaxima = cargaHorariaMaxima;
        this.materias = new ArrayList<>();
        this.materias.add(materia);
    }


    public int getCargaHorariaMaxima() {
        return cargaHorariaMaxima;
    }

    public void agregarMateria(Materia materia) {
        materias.add(materia);

    }
    public List<Materia> obtenerMaterias() {
        return materias;
    }

    @Override
    public String toString() {
        return "Carrera{" +
                "nombre='" + nombre + '\'' +
                ", materias=" + materias +
                '}';
    }
}