
package com.acunaportfolio.Aacuna.Entity;

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
    private int fechaEduini;
    private int fechaEdufin;
    private String descEdu;
    private String imgEdu;

    public Educacion() {
    }

    public Educacion(Long idEdu, String tituloEdu, int fechaEduini, int fechaEdufin, String descEdu, String imgEdu) {
        this.idEdu = idEdu;
        this.tituloEdu = tituloEdu;
        this.fechaEduini = fechaEduini;
        this.fechaEdufin = fechaEdufin;
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

    public int getFechaEduini() {
        return fechaEduini;
    }

    public void setFechaEduini(int fechaEduini) {
        this.fechaEduini = fechaEduini;
    }

    public int getFechaEdufin() {
        return fechaEdufin;
    }

    public void setFechaEdufin(int fechaEdufin) {
        this.fechaEdufin = fechaEdufin;
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
