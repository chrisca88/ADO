package test.java.com;

import main.java.com.controllers.ControladorEstudiante;
import main.java.com.model.*;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Materia materia = new Materia("Analisis Matematico", 10,300);
        Materia materia1 = new Materia("Analisis Matematico2",25,500);
        List <Materia> correlativas = new ArrayList<>();
        //correlativas.add(materia1);
        //correlativas.add(materia);
        //materia1.setCorrelativasAnteriores(correlativas);


        Carrera carrera = new Carrera("Ingenieria Informatica",64,materia);
        carrera.agregarMateria(materia1);





        Estudiante estudiante = new Estudiante("Christian","Casal","34098569","126510",carrera);
        ControladorEstudiante controladorEstudiante = ControladorEstudiante.getInstancia();
        controladorEstudiante.nuevoEstudiante("Christian","Casal","34098569","126510",carrera);

        Aula aula = new Aula(1,10);
        Docente docente = new Docente("Ana","Martinez","1111111","888888");


        Curso curso = new Curso(1,aula,"10:30",materia);
        docente.agregarCurso(curso);
        curso.agregarDocente(docente);



        Inscripcion inscripcion = new Inscripcion();
        //inscripcion.inscribirEstudiante(estudiante,curso);
        //controladorEstudiante.inscribirseCurso(estudiante,curso);

        List<Curso> cursosInscriptos = estudiante.getCursosInscriptos();

        System.out.println(cursosInscriptos);

        Aula aula1 = new Aula(2,10);
        Docente docente1 = new Docente("Juan","Perez","222222","777777");
        Curso curso1 = new Curso(2,aula1,"10:00",materia1);
        inscripcion.inscribirEstudiante(estudiante,curso);
        inscripcion.inscribirEstudiante(estudiante,curso1);
        docente1.agregarCurso(curso1);
        curso1.agregarDocente(docente1);
        docente1.agregarCurso(curso);
        curso.agregarDocente(docente1);



        estudiante.verCursosMateria(materia1);


        System.out.println(docente1.getCursosAsignados());
        System.out.println(curso1.getDocenteAsignado());
        System.out.println(curso.getDocenteAsignado());

        System.out.println(estudiante.getCarrera());
        System.out.println(estudiante.verCargaHoraria());



        estudiante.pagarCuota(1);

        docente1.generarReporte("reporte1",docente1.getCursosAsignados());
    }
}
