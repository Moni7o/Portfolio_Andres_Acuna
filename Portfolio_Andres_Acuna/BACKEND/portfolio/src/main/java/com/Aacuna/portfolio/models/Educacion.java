
package com.Aacuna.portfolio.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Educacion {
       @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idEdu;
    private String tituloEdu;
    private int fechaEduIni;
    private int fechaEduFin;
    private String descEdu;
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, int fechaEduIni, int fechaEduFin, String descEdu, String imgEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEduIni = fechaEduIni;
        this.fechaEduFin = fechaEduFin;
        this.descEdu = descEdu;
        this.imgEdu = imgEdu;
    }

    public Long getIdEdu() {
        return idEdu;
    }

    public void setIdEdu(Long idEdu) {
        this.idEdu = idEdu;
    }

    public String getTituloEdu() {
        return tituloEdu;
    }

    public void setTituloEdu(String tituloEdu) {
        this.tituloEdu = tituloEdu;
    }

    public int getFechaEduIni() {
        return fechaEduIni;
    }

    public void setFechaEduIni(int fechaEduIni) {
        this.fechaEduIni = fechaEduIni;
    }

    public int getFechaEduFin() {
        return fechaEduFin;
    }

    public void setFechaEduFin(int fechaEduFin) {
        this.fechaEduFin = fechaEduFin;
    }

    public String getDescEdu() {
        return descEdu;
    }

    public void setDescEdu(String descEdu) {
        this.descEdu = descEdu;
    }

    public String getImgEdu() {
        return imgEdu;
    }

    public void setImgEdu(String imgEdu) {
        this.imgEdu = imgEdu;
    }
    
    
    
    
    
    
}
