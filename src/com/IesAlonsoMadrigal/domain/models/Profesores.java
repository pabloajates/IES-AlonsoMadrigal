package com.IesAlonsoMadrigal.domain.models;

public class Profesores {

    private Integer id;
    private String nombre;
    private String titulo_academico;
    private String fecha_alta;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo_academico() {
        return titulo_academico;
    }

    public void setTitulo_academico(String titulo_academico) {
        this.titulo_academico = titulo_academico;
    }

    public String getFecha_alta() {
        return fecha_alta;
    }

    public void setFecha_alta(String fecha_alta) {
        this.fecha_alta = fecha_alta;
    }
}
