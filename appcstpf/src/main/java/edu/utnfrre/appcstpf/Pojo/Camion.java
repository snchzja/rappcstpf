package edu.utnfrre.appcstpf.Pojo;
// Generated 09/06/2015 21:03:08 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Camion generated by hbm2java
 */
public class Camion  implements java.io.Serializable {


     private String patenteCamion;
     private Integer metrosCubicosCarga;
     private String marcaCamion;
     private String modeloCamion;
     private Integer anioCamion;
     private Integer cargaMaximaKggCamion;
     private String descripcinCamion;
     private Date fechaRegistro;
     private Date fechaModificacion;
     private Set transportes = new HashSet(0);

    public Camion() {
    }

	
    public Camion(String patenteCamion, Date fechaRegistro, Date fechaModificacion) {
        this.patenteCamion = patenteCamion;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }
    public Camion(String patenteCamion, Integer metrosCubicosCarga, String marcaCamion, String modeloCamion, Integer anioCamion, Integer cargaMaximaKggCamion, String descripcinCamion, Date fechaRegistro, Date fechaModificacion, Set transportes) {
       this.patenteCamion = patenteCamion;
       this.metrosCubicosCarga = metrosCubicosCarga;
       this.marcaCamion = marcaCamion;
       this.modeloCamion = modeloCamion;
       this.anioCamion = anioCamion;
       this.cargaMaximaKggCamion = cargaMaximaKggCamion;
       this.descripcinCamion = descripcinCamion;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
       this.transportes = transportes;
    }
   
    public String getPatenteCamion() {
        return this.patenteCamion;
    }
    
    public void setPatenteCamion(String patenteCamion) {
        this.patenteCamion = patenteCamion;
    }
    public Integer getMetrosCubicosCarga() {
        return this.metrosCubicosCarga;
    }
    
    public void setMetrosCubicosCarga(Integer metrosCubicosCarga) {
        this.metrosCubicosCarga = metrosCubicosCarga;
    }
    public String getMarcaCamion() {
        return this.marcaCamion;
    }
    
    public void setMarcaCamion(String marcaCamion) {
        this.marcaCamion = marcaCamion;
    }
    public String getModeloCamion() {
        return this.modeloCamion;
    }
    
    public void setModeloCamion(String modeloCamion) {
        this.modeloCamion = modeloCamion;
    }
    public Integer getAnioCamion() {
        return this.anioCamion;
    }
    
    public void setAnioCamion(Integer anioCamion) {
        this.anioCamion = anioCamion;
    }
    public Integer getCargaMaximaKggCamion() {
        return this.cargaMaximaKggCamion;
    }
    
    public void setCargaMaximaKggCamion(Integer cargaMaximaKggCamion) {
        this.cargaMaximaKggCamion = cargaMaximaKggCamion;
    }
    public String getDescripcinCamion() {
        return this.descripcinCamion;
    }
    
    public void setDescripcinCamion(String descripcinCamion) {
        this.descripcinCamion = descripcinCamion;
    }
    public Date getFechaRegistro() {
        return this.fechaRegistro;
    }
    
    public void setFechaRegistro(Date fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }
    public Date getFechaModificacion() {
        return this.fechaModificacion;
    }
    
    public void setFechaModificacion(Date fechaModificacion) {
        this.fechaModificacion = fechaModificacion;
    }
    public Set getTransportes() {
        return this.transportes;
    }
    
    public void setTransportes(Set transportes) {
        this.transportes = transportes;
    }




}

