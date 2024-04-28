package main.java.com.model;

import java.util.*;

/**
 *
 */
public class Materia {

    private String nombre;
    private int cargaHoraria;
    private List<Materia> correlativasPosteriores;
    private List<Materia> correlativasAnteriores;
    private List<Curso> cursos;
    private float costo;

    /**
     * Default constructor
     */
    public Materia() {
    }

    public Materia(String nombre, int cargaHoraria, float costo) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.cursos = new ArrayList<>();
        this.costo = costo;
    }

    public Materia(String nombre, int cargaHoraria, List<Materia> correlativasPosteriores, float costo) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.correlativasPosteriores = correlativasPosteriores;
        this.cursos = new ArrayList<>();
        this.costo = costo;
    }

    public Materia(String nombre, int cargaHoraria, List<Materia> correlativasPosteriores, List<Materia> correlativasAnteriores, float costo) {
        this.nombre = nombre;
        this.cargaHoraria = cargaHoraria;
        this.correlativasPosteriores = correlativasPosteriores;
        this.correlativasAnteriores = correlativasAnteriores;
        this.cursos = new ArrayList<>();
        this.costo = costo;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public float getCosto() {
        return costo;
    }

    public String getNombre() {
        return nombre;
    }

    public List<Curso> obtenerCursos() {
        return cursos;
    }

    public void agregarCurso(Curso curso){
        cursos.add(curso);
    }
    public List<Materia> getCorrelativasAnteriores() {
        return correlativasAnteriores;
    }

    public void setCorrelativasPosteriores(List<Materia> correlativasPosteriores) {
        this.correlativasPosteriores = correlativasPosteriores;
    }

    public void setCorrelativasAnteriores(List<Materia> correlativasAnteriores) {
        this.correlativasAnteriores = correlativasAnteriores;
    }

    @Override
    public String toString() {
        return "Materia{" +
                "nombre='" + nombre + '\'' +
                '}';
    }


}