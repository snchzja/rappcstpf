package edu.utnfrre.appcstpf.Pojo;
// Generated 09/06/2015 21:03:08 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Seguro generated by hbm2java
 */
public class Seguro  implements java.io.Serializable {


     private int seguroId;
     private String nombreSeguro;
     private String descSeguri;
     private BigDecimal montoMaximoSeguro;
     private BigDecimal montoMinimoSeguro;
     private BigDecimal comisionPorEnvio;
     private Date fechaRegistro;
     private Date fechaModificacion;
     private Set paquetes = new HashSet(0);

    public Seguro() {
    }

	
    public Seguro(int seguroId, Date fechaRegistro, Date fechaModificacion) {
        this.seguroId = seguroId;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }
    public Seguro(int seguroId, String nombreSeguro, String descSeguri, BigDecimal montoMaximoSeguro, BigDecimal montoMinimoSeguro, BigDecimal comisionPorEnvio, Date fechaRegistro, Date fechaModificacion, Set paquetes) {
       this.seguroId = seguroId;
       this.nombreSeguro = nombreSeguro;
       this.descSeguri = descSeguri;
       this.montoMaximoSeguro = montoMaximoSeguro;
       this.montoMinimoSeguro = montoMinimoSeguro;
       this.comisionPorEnvio = comisionPorEnvio;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
       this.paquetes = paquetes;
    }
   
    public int getSeguroId() {
        return this.seguroId;
    }
    
    public void setSeguroId(int seguroId) {
        this.seguroId = seguroId;
    }
    public String getNombreSeguro() {
        return this.nombreSeguro;
    }
    
    public void setNombreSeguro(String nombreSeguro) {
        this.nombreSeguro = nombreSeguro;
    }
    public String getDescSeguri() {
        return this.descSeguri;
    }
    
    public void setDescSeguri(String descSeguri) {
        this.descSeguri = descSeguri;
    }
    public BigDecimal getMontoMaximoSeguro() {
        return this.montoMaximoSeguro;
    }
    
    public void setMontoMaximoSeguro(BigDecimal montoMaximoSeguro) {
        this.montoMaximoSeguro = montoMaximoSeguro;
    }
    public BigDecimal getMontoMinimoSeguro() {
        return this.montoMinimoSeguro;
    }
    
    public void setMontoMinimoSeguro(BigDecimal montoMinimoSeguro) {
        this.montoMinimoSeguro = montoMinimoSeguro;
    }
    public BigDecimal getComisionPorEnvio() {
        return this.comisionPorEnvio;
    }
    
    public void setComisionPorEnvio(BigDecimal comisionPorEnvio) {
        this.comisionPorEnvio = comisionPorEnvio;
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
    public Set getPaquetes() {
        return this.paquetes;
    }
    
    public void setPaquetes(Set paquetes) {
        this.paquetes = paquetes;
    }




}


