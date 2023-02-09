package com.IesAlonsoMadrigal.domain.models;

public class Matriculas {

    private Integer id;
    private Curso curso;
    private Alumnos alumnos;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Alumnos getAlumnos(){
        return alumnos;
    }

    public void setAlumnos(Alumnos alumnos){
        this.alumnos=alumnos;
    }
}
