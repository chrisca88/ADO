package test.java.com;

import main.java.com.controllers.*;
import main.java.com.model.*;

import java.util.ArrayList;
import java.util.List;

public class TestInscripcionCursos {
    public static void main(String[] args) {
        ControladorMateria controladorMateria = new ControladorMateria();
        Materia materia = controladorMateria.nuevaMateria("Analisis Matematico",10,300);
        Materia materia1 = controladorMateria.nuevaMateria("Analisis Matematico 2",20,600);

        List<Materia> correlativasM1 = new ArrayList<>();
        correlativasM1.add(materia);
        materia1.setCorrelativasAnteriores(correlativasM1);

        Carrera carrera = new Carrera("Ingenieria Informatica",64,materia);
        carrera.agregarMateria(materia);
        carrera.agregarMateria(materia1);

        ControladorEstudiante estudiante = ControladorEstudiante.getInstancia();
        Estudiante nuevoEstudiante = estudiante.nuevoEstudiante("Christian","casal","34098569","126510",carrera);

        Aula aula = new Aula(1,10);
        ControladorCurso controladorCurso = new ControladorCurso();
        Curso curso = controladorCurso.crearCurso(1,aula,"10:30",materia);

        Aula aula1 = new Aula(2,5);
        ControladorCurso controladorCurso1 = new ControladorCurso();
        Curso curso1 = controladorCurso1.crearCurso(1,aula1,"10:30",materia1);

        ControladorDocente docente = ControladorDocente.getInstancia();
        Docente docenteTest = docente.nuevoDocente("Pamela","Suarez","55555","5796879");
        curso.agregarDocente(docenteTest);
        docenteTest.agregarCurso(curso);

        ControladorInscripcion inscripcion = ControladorInscripcion.getInstancia();
        inscripcion.InscirpcionEstudiante(nuevoEstudiante,curso);

        nuevoEstudiante.pagarCuota(1);

        inscripcion.InscirpcionEstudiante(nuevoEstudiante,curso1);
    }
}
