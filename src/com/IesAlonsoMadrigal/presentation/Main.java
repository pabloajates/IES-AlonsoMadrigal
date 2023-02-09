package com.IesAlonsoMadrigal.presentation;

import com.IesAlonsoMadrigal.domain.models.*;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Alumnos alumno = new Alumnos();
        alumno.setId(1);
        alumno.setNombre("Juan");
        alumno.setDni("01453456A");
        alumno.setApellidos("Ajates");
        alumno.setMadre("Maria");
        alumno.setPadre("Enrique");
        alumno.setEmail("Juanajates@gmail.com");
        alumno.setDireccion("Ávila");

        Profesores profesor = new Profesores();
        profesor.setId(1);
        profesor.setDni("23456785C");
        profesor.setNombre("Consuelo");
        profesor.setApellidos("Arenas");
        profesor.setTitulo_academico("Programacion");

        Curso curso = new Curso();
        curso.setId(2);
        curso.setNombre("dam1");
        curso.setDescripcion("Desarrolo de aplicaciones multiplataforma");

        Asignaturas asignatura = new Asignaturas();
        asignatura.setId(2);
        asignatura.setNombre("Programacion");
        asignatura.setCurso(curso);

        Matriculas matricula = new Matriculas();
        matricula.setCurso(curso);
        matricula.setId(2);
        matricula.setAlumnos(alumno);

        Sala_Docencia salaDocencia = new Sala_Docencia();
        salaDocencia.setId(4);
        salaDocencia.setSillas(12);
        salaDocencia.setTipo_pizarra("Verde");
        salaDocencia.setCapacidad("17 alumnos");
        salaDocencia.setPlanta("3º planta");
        salaDocencia.setCurso(curso);

        Sala_Ordenadores salaOrdenador = new Sala_Ordenadores();
        salaOrdenador.setId(5);
        salaOrdenador.setNum_ordenadores(18);
        salaOrdenador.setTipo_ordenadores("Sobremesa");
        salaOrdenador.setCapacidad("19 alumnos");
        salaOrdenador.setPlanta("2º planta");
        salaOrdenador.setCurso(curso);
    }
}