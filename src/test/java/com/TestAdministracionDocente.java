package test.java.com;

import main.java.com.controllers.ControladorCurso;
import main.java.com.controllers.ControladorDocente;
import main.java.com.controllers.ControladorMateria;
import main.java.com.model.*;

public class TestAdministracionDocente {
    public static void main(String[] args) {

        ControladorMateria controladorMateria = new ControladorMateria();
        Materia materia = controladorMateria.nuevaMateria("Analisis Matematico",10,300);

        Carrera carrera = new Carrera("Ingenieria Informatica",64,materia);
        carrera.agregarMateria(materia);

        Aula aula = new Aula(1,10);
        ControladorCurso controladorCurso = new ControladorCurso();
        Curso curso = controladorCurso.crearCurso(1,aula,"10:30",materia);

        ControladorDocente docente = ControladorDocente.getInstancia();
        Docente docenteTest = docente.nuevoDocente("Pamela","Suarez","55555","5796879");
        curso.agregarDocente(docenteTest);
        docenteTest.agregarCurso(curso);

        docenteTest.generarReporte("ReporteTest",docenteTest.getCursosAsignados());

    }
}
