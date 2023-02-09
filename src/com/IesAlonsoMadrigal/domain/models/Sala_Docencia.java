package com.IesAlonsoMadrigal.domain.models;

public class Sala_Docencia extends Sala {

    private Integer sillas;

    private String tipo_pizarra;



    public Integer getSillas() {
        return sillas;
    }

    public void setSillas(Integer sillas) {
        this.sillas = sillas;
    }



    public String getTipo_pizarra() {
        return tipo_pizarra;
    }

    public void setTipo_pizarra(String tipo_pizarra) {
        this.tipo_pizarra = tipo_pizarra;
    }
}
