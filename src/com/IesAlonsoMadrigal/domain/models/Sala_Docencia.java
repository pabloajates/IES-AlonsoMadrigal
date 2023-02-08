package com.IesAlonsoMadrigal.domain.models;

public class Sala_Docencia extends Sala {

    private String sillas;

    private String tipo_pizarra;



    public String getSillas() {
        return sillas;
    }

    public void setSillas(String sillas) {
        this.sillas = sillas;
    }



    public String getTipo_pizarra() {
        return tipo_pizarra;
    }

    public void setTipo_pizarra(String tipo_pizarra) {
        this.tipo_pizarra = tipo_pizarra;
    }
}
