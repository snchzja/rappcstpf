package edu.utnfrre.appcstpf.Pojo;
// Generated 09/06/2015 21:03:08 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * TipoEstado generated by hbm2java
 */
public class TipoEstado  implements java.io.Serializable {


     private char tipoEstadoId;
     private String nombretipoEstado;
     private Date fechaRegistro;
     private Date fechaModificacion;
     private Set estados = new HashSet(0);

    public TipoEstado() {
    }

	
    public TipoEstado(char tipoEstadoId, Date fechaRegistro, Date fechaModificacion) {
        this.tipoEstadoId = tipoEstadoId;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }
    public TipoEstado(char tipoEstadoId, String nombretipoEstado, Date fechaRegistro, Date fechaModificacion, Set estados) {
       this.tipoEstadoId = tipoEstadoId;
       this.nombretipoEstado = nombretipoEstado;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
       this.estados = estados;
    }
   
    public char getTipoEstadoId() {
        return this.tipoEstadoId;
    }
    
    public void setTipoEstadoId(char tipoEstadoId) {
        this.tipoEstadoId = tipoEstadoId;
    }
    public String getNombretipoEstado() {
        return this.nombretipoEstado;
    }
    
    public void setNombretipoEstado(String nombretipoEstado) {
        this.nombretipoEstado = nombretipoEstado;
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
    public Set getEstados() {
        return this.estados;
    }
    
    public void setEstados(Set estados) {
        this.estados = estados;
    }




}


