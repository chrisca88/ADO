package test.java.com;

import main.java.com.controllers.*;
import main.java.com.model.*;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {

        ControladorMateria materia2 = new ControladorMateria();
        materia2.nuevaMateria("Analisis Matematico 3",14,20);

        Materia materia1 = new Materia("Analisis Matematico2", 25,500);
        List<Materia> correlativas = new ArrayList<>();
        correlativas.add(materia1);
        Aula aula = new Aula(1,10);

        Materia materia = new Materia("Analisis Matematico", 10,correlativas,300);

        Carrera carrera = new Carrera("Ingenieria Informatica",64,materia);


        ControladorEstudiante estudiante = ControladorEstudiante.getInstancia();
        Estudiante nuevoEstudiante = estudiante.nuevoEstudiante("Christian","casal","34098569","126510",carrera);

        ControladorCurso nuevoCurso = new ControladorCurso();


        Curso curso = new Curso(1,aula,"10:30",materia1);

        ControladorDocente docente = ControladorDocente.getInstancia();
        Docente docenteTest = docente.nuevoDocente("Ana","Martinez","55555","5796879");
        Curso test = nuevoCurso.crearCurso(3,aula,"12:30",materia);
        test.agregarDocente(docenteTest);



        ControladorInscripcion inscripcion = ControladorInscripcion.getInstancia();
        inscripcion.InscirpcionEstudiante(nuevoEstudiante,curso);

        nuevoEstudiante.pagarCuota(1);



//        estudiante.inscribirseCurso(estudiante,new Curso(1,new Aula(2,20),"17:00",materia));
//
//        estudiante.pagarCuota(1);


    }
}
