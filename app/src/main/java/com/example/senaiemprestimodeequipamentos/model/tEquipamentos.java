package com.example.senaiemprestimodeequipamentos.model;

import java.io.Serializable;

public class tEquipamentos implements Serializable {
    private Long codEquip;
    private String nomeEquip;
    private String marcaEquip;
    private String descEquip;

    public Long getCodEquip() {
        return codEquip;
    }

    public void setCodEquip(Long codEquip) {
        this.codEquip = codEquip;
    }

    public String getNomeEquip() {
        return nomeEquip;
    }

    public void setNomeEquip(String nomeEquip) {
        this.nomeEquip = nomeEquip;
    }

    public String getMarcaEquip() {
        return marcaEquip;
    }

    public void setMarcaEquip(String marcaEquip) {
        this.marcaEquip = marcaEquip;
    }

    public String getDescEquip() {
        return descEquip;
    }

    public void setDescEquip(String descEquip) {
        this.descEquip = descEquip;
    }
}
