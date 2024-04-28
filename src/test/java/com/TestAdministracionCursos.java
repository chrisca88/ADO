package test.java.com;

import main.java.com.controllers.ControladorCurso;
import main.java.com.controllers.ControladorDocente;
import main.java.com.controllers.ControladorMateria;
import main.java.com.model.*;

import java.util.ArrayList;
import java.util.List;

public class TestAdministracionCursos {
    public static void main(String[] args) {

        ControladorMateria controladorMateria = new ControladorMateria();
        Materia materia = controladorMateria.nuevaMateria("Analisis Matematico",10,300);
        Materia materia1 = controladorMateria.nuevaMateria("Analisis Matematico 2",20,600);
        Materia materia2 = controladorMateria.nuevaMateria("Analisis Matematico 3",40,1200);

        List<Materia> correlativasM1 = new ArrayList<>();
        correlativasM1.add(materia);
        materia1.setCorrelativasAnteriores(correlativasM1);

        List<Materia> correlativasM1P = new ArrayList<>();
        correlativasM1P.add(materia2);
        materia1.setCorrelativasPosteriores(correlativasM1P);

        List<Materia> correlativasM2 = new ArrayList<>();
        correlativasM2.add(materia1);
        materia2.setCorrelativasAnteriores(correlativasM2);


        Carrera carrera = new Carrera("Ingenieria Informatica",64,materia);
        carrera.agregarMateria(materia);
        carrera.agregarMateria(materia1);
        carrera.agregarMateria(materia2);

        Aula aula = new Aula(1,10);
        Aula aula1 = new Aula(2,20);
        Aula aula2 = new Aula(3,30);

        ControladorCurso controladorCurso = new ControladorCurso();
        Curso curso = controladorCurso.crearCurso(1,aula,"10:30",materia);
        Curso curso1 = controladorCurso.crearCurso(1,aula1,"10:30",materia1);
        Curso curso2 = controladorCurso.crearCurso(1,aula2,"10:30",materia2);

        ControladorDocente docente = ControladorDocente.getInstancia();
        Docente docenteTest = docente.nuevoDocente("Pamela","Suarez","55555","5796879");
        curso.agregarDocente(docenteTest);
        curso1.agregarDocente(docenteTest);
        curso2.agregarDocente(docenteTest);

    }
}
