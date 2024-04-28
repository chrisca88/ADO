package main.java.com.model;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Curso {

    private int numero;
    private Aula aulaAsignada;
    private String horario;
    private List<Docente> docenteAsignado;
    private Materia materia;
    private List<Estudiante> estudiantesInscriptos;
    private LocalDate fecha;

    /**
     * Default constructor
     */

    public Curso(int numero,Aula aulaAsignada, String horario, Materia materia) {
        this.numero = numero;
        this.aulaAsignada = aulaAsignada;
        this.horario = horario;
        this.docenteAsignado = new ArrayList<>();
        this.materia = materia;
        this.estudiantesInscriptos = new ArrayList<>();
        LocalDate fechaHoy =  LocalDate.now();
        DateTimeFormatter formatoIso = DateTimeFormatter.ISO_LOCAL_DATE;
        this.fecha = LocalDate.parse(fechaHoy.format(formatoIso));

    }

    public Materia getMateria() {
        return materia;
    }

    public String getHorario() {
        return horario;
    }

    public void agregarDocente(Docente docente){
        docenteAsignado.add(docente);
    }
    public int calcularCapacidad() {
        int capacidadDisponible = aulaAsignada.getCapacidadMaxima() - estudiantesInscriptos.size();
        return capacidadDisponible;

    }
    public LocalDate getFecha() {
        return fecha;
    }


    @Override
    public String toString() {
        return "Curso{" +
                "aulaAsignada=" + aulaAsignada +
                ", horario='" + horario + '\'' +
                ", docenteAsignado=" + docenteAsignado +
                ", materia=" + materia +
                '}';
    }


}