
package com.acunaportfolio.Aacuna.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Experiencia {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idExp;
    private String tituloExp;
    private int fechaExpini;
    private int fechaExpfin;
    private String descExp;
    private String imgExp;

    public Experiencia() {
    }

    public Experiencia(Long idExp, String tituloExp, int fechaExpini, int fechaExpfin, String descExp, String imgExp) {
        this.idExp = idExp;
        this.tituloExp = tituloExp;
        this.fechaExpini = fechaExpini;
        this.fechaExpfin = fechaExpfin;
        this.descExp = descExp;
        this.imgExp = imgExp;
    }

    public Long getIdExp() {
        return idExp;
    }

    public void setIdExp(Long idExp) {
        this.idExp = idExp;
    }

    public String getTituloExp() {
        return tituloExp;
    }

    public void setTituloExp(String tituloExp) {
        this.tituloExp = tituloExp;
    }

    public int getFechaExpini() {
        return fechaExpini;
    }

    public void setFechaExpini(int fechaExpini) {
        this.fechaExpini = fechaExpini;
    }

    public int getFechaExpfin() {
        return fechaExpfin;
    }

    public void setFechaExpfin(int fechaExpfin) {
        this.fechaExpfin = fechaExpfin;
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

