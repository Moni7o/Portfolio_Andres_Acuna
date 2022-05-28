
package com.Aacuna.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String empresa;
    private int fechaExpIni;
    private int fechaExpFin;
    private String descExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String empresa, int fechaExpIni, int fechaExpFin, String descExp, String imgExp) {
        this.idExp = idExp;
        this.empresa = empresa;
        this.fechaExpIni = fechaExpIni;
        this.fechaExpFin = fechaExpFin;
        this.descExp = descExp;
        this.imgExp = imgExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public int getFechaExpIni() {
        return fechaExpIni;
    }

    public void setFechaExpIni(int fechaExpIni) {
        this.fechaExpIni = fechaExpIni;
    }

    public int getFechaExpFin() {
        return fechaExpFin;
    }

    public void setFechaExpFin(int fechaExpFin) {
        this.fechaExpFin = fechaExpFin;
    }

    public String getDescExp() {
        return descExp;
    }

    public void setDescExp(String descExp) {
        this.descExp = descExp;
    }

    public String getImgExp() {
        return imgExp;
    }

    public void setImgExp(String imgExp) {
        this.imgExp = imgExp;
    }
    
    
    
    
}
