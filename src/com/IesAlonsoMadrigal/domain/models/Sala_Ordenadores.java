package com.IesAlonsoMadrigal.domain.models;

public class Sala_Ordenadores {

    private Integer id;
    private String planta;
    private String num_ordenadores;
    private String capacidad;
    private String tipo_ordenadores;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPlanta() {
        return planta;
    }

    public void setPlanta(String planta) {
        this.planta = planta;
    }

    public String getNum_ordenadores() {
        return num_ordenadores;
    }

    public void setNum_ordenadores(String num_ordenadores) {
        this.num_ordenadores = num_ordenadores;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo_ordenadores() {
        return tipo_ordenadores;
    }

    public void setTipo_ordenadores(String tipo_ordenadores) {
        this.tipo_ordenadores = tipo_ordenadores;
    }
}
