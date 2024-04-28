package main.java.com.model;

import java.util.*;


public class Estudiante {

    private String nombre;
    private String apellido;
    private String dni;
    private String legajo;
    private Carrera carrera;
    private List<Curso> cursosInscriptos;
    private List<Materia> materiasAprobadas;


    public Estudiante(String nombre, String apellido, String dni, String legajo, Carrera carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.legajo = legajo;
        this.carrera = carrera;
        this.cursosInscriptos = new ArrayList<>();
        this.materiasAprobadas = new ArrayList<>();
    }

    public Carrera getCarrera() {return carrera;}

    public List<Curso> getCursosInscriptos() {
        return cursosInscriptos;
    }

    public List<Materia> getMateriasAprobadas() {
        return materiasAprobadas;
    }


    /**
     * @param curso
     */
    public void inscribirseCurso(Estudiante estudiante,Curso curso) {
        estudiante.cursosInscriptos.add(curso);
    }

    /**
     * @param materia
     */
    public void verCursosMateria(Materia materia) {
        List<Curso> cursos = materia.obtenerCursos();
        for (Curso curso : cursos) {
            System.out.println("Curso: " + curso.getMateria() + ", Horario: " + curso.getHorario());
        }
    }

    /**
     *
     */
    public int verCargaHoraria() {
        int cargaHorariaTotal = 0;
        for (Curso curso : cursosInscriptos) {
            cargaHorariaTotal += curso.getMateria().getCargaHoraria();
        }
        return  cargaHorariaTotal;
    }

    /**
     * @param materia
     */
    public void agregarMateriasAprobadas(Materia materia) {
        materiasAprobadas.add(materia);
    }

    public void pagarCuota(int numero){
        float montoCuota = 0;
        for (Curso curso : cursosInscriptos) {
            montoCuota += curso.getMateria().getCosto();
        }

        Cuota cuota = new Cuota(numero, montoCuota);

        IMetodoDePago metodoDePago = new MercadoPago();
        metodoDePago.pagarCuota(cuota);

    }

}