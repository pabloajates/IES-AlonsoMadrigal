package com.IesAlonsoMadrigal.domain.models;

public class Sala_Docencia {
    private Integer id;
    private String planta;
    private String sillas;
    private String capacidad;
    private String tipo_pizarra;

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

    public String getSillas() {
        return sillas;
    }

    public void setSillas(String sillas) {
        this.sillas = sillas;
    }

    public String getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(String capacidad) {
        this.capacidad = capacidad;
    }

    public String getTipo_pizarra() {
        return tipo_pizarra;
    }

    public void setTipo_pizarra(String tipo_pizarra) {
        this.tipo_pizarra = tipo_pizarra;
    }
}
