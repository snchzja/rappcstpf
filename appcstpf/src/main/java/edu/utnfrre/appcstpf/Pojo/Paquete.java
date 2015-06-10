package edu.utnfrre.appcstpf.Pojo;
// Generated 09/06/2015 21:03:08 by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

/**
 * Paquete generated by hbm2java
 */
public class Paquete  implements java.io.Serializable {


     private int paqueteId;
     private Seguro seguro;
     private Servicio servicio;
     private Sucursal sucursalByDestinoPaquete;
     private Sucursal sucursalByOrigenPaquete;
     private Usuario usuario;
     private BigDecimal pesoPaquete;
     private BigDecimal costoBasicoPaquete;
     private BigDecimal costoSinSeguroPaquete;
     private BigDecimal costoTotalPaquete;
     private boolean pagadoPaquete;
     private BigDecimal distanciaPaquete;
     private String nombreServicio;
     private int kgPorExcesoPaquete;
     private int estampillasPorExcesoServicio;
     private BigDecimal precioBasicoServicio;
     private Integer kgBasicoServicio;
     private boolean tieneSeguroPaquete;
     private BigDecimal montoAseguradoPaquete;
     private BigDecimal comisionSeguroPaquete;
     private BigDecimal costoSeguroPaquete;
     private int dniRemitente;
     private String nombreRemitente;
     private String apellidoRemitente;
     private String direcionRemitente;
     private String telefonoRemitinte;
     private Integer codigoPostalRemitente;
     private String emailRemitente;
     private int dniDestinatario;
     private String nombreDestinatario;
     private String apellidoDestinatario;
     private String direcionDestinatario;
     private String telefonoDestinatario;
     private Integer codigoPostalDestinatario;
     private String emailDestinatario;
     private Date fechaRegistro;
     private Date fechaModificacion;
     private Set paquetesPorTransportes = new HashSet(0);
     private Factura factura;
     private Set estados = new HashSet(0);

    public Paquete() {
    }

	
    public Paquete(int paqueteId, Seguro seguro, Servicio servicio, Sucursal sucursalByDestinoPaquete, Sucursal sucursalByOrigenPaquete, Usuario usuario, BigDecimal pesoPaquete, BigDecimal costoBasicoPaquete, BigDecimal costoSinSeguroPaquete, BigDecimal costoTotalPaquete, boolean pagadoPaquete, BigDecimal distanciaPaquete, String nombreServicio, int kgPorExcesoPaquete, int estampillasPorExcesoServicio, boolean tieneSeguroPaquete, int dniRemitente, int dniDestinatario, Date fechaRegistro, Date fechaModificacion) {
        this.paqueteId = paqueteId;
        this.seguro = seguro;
        this.servicio = servicio;
        this.sucursalByDestinoPaquete = sucursalByDestinoPaquete;
        this.sucursalByOrigenPaquete = sucursalByOrigenPaquete;
        this.usuario = usuario;
        this.pesoPaquete = pesoPaquete;
        this.costoBasicoPaquete = costoBasicoPaquete;
        this.costoSinSeguroPaquete = costoSinSeguroPaquete;
        this.costoTotalPaquete = costoTotalPaquete;
        this.pagadoPaquete = pagadoPaquete;
        this.distanciaPaquete = distanciaPaquete;
        this.nombreServicio = nombreServicio;
        this.kgPorExcesoPaquete = kgPorExcesoPaquete;
        this.estampillasPorExcesoServicio = estampillasPorExcesoServicio;
        this.tieneSeguroPaquete = tieneSeguroPaquete;
        this.dniRemitente = dniRemitente;
        this.dniDestinatario = dniDestinatario;
        this.fechaRegistro = fechaRegistro;
        this.fechaModificacion = fechaModificacion;
    }
    public Paquete(int paqueteId, Seguro seguro, Servicio servicio, Sucursal sucursalByDestinoPaquete, Sucursal sucursalByOrigenPaquete, Usuario usuario, BigDecimal pesoPaquete, BigDecimal costoBasicoPaquete, BigDecimal costoSinSeguroPaquete, BigDecimal costoTotalPaquete, boolean pagadoPaquete, BigDecimal distanciaPaquete, String nombreServicio, int kgPorExcesoPaquete, int estampillasPorExcesoServicio, BigDecimal precioBasicoServicio, Integer kgBasicoServicio, boolean tieneSeguroPaquete, BigDecimal montoAseguradoPaquete, BigDecimal comisionSeguroPaquete, BigDecimal costoSeguroPaquete, int dniRemitente, String nombreRemitente, String apellidoRemitente, String direcionRemitente, String telefonoRemitinte, Integer codigoPostalRemitente, String emailRemitente, int dniDestinatario, String nombreDestinatario, String apellidoDestinatario, String direcionDestinatario, String telefonoDestinatario, Integer codigoPostalDestinatario, String emailDestinatario, Date fechaRegistro, Date fechaModificacion, Set paquetesPorTransportes, Factura factura, Set estados) {
       this.paqueteId = paqueteId;
       this.seguro = seguro;
       this.servicio = servicio;
       this.sucursalByDestinoPaquete = sucursalByDestinoPaquete;
       this.sucursalByOrigenPaquete = sucursalByOrigenPaquete;
       this.usuario = usuario;
       this.pesoPaquete = pesoPaquete;
       this.costoBasicoPaquete = costoBasicoPaquete;
       this.costoSinSeguroPaquete = costoSinSeguroPaquete;
       this.costoTotalPaquete = costoTotalPaquete;
       this.pagadoPaquete = pagadoPaquete;
       this.distanciaPaquete = distanciaPaquete;
       this.nombreServicio = nombreServicio;
       this.kgPorExcesoPaquete = kgPorExcesoPaquete;
       this.estampillasPorExcesoServicio = estampillasPorExcesoServicio;
       this.precioBasicoServicio = precioBasicoServicio;
       this.kgBasicoServicio = kgBasicoServicio;
       this.tieneSeguroPaquete = tieneSeguroPaquete;
       this.montoAseguradoPaquete = montoAseguradoPaquete;
       this.comisionSeguroPaquete = comisionSeguroPaquete;
       this.costoSeguroPaquete = costoSeguroPaquete;
       this.dniRemitente = dniRemitente;
       this.nombreRemitente = nombreRemitente;
       this.apellidoRemitente = apellidoRemitente;
       this.direcionRemitente = direcionRemitente;
       this.telefonoRemitinte = telefonoRemitinte;
       this.codigoPostalRemitente = codigoPostalRemitente;
       this.emailRemitente = emailRemitente;
       this.dniDestinatario = dniDestinatario;
       this.nombreDestinatario = nombreDestinatario;
       this.apellidoDestinatario = apellidoDestinatario;
       this.direcionDestinatario = direcionDestinatario;
       this.telefonoDestinatario = telefonoDestinatario;
       this.codigoPostalDestinatario = codigoPostalDestinatario;
       this.emailDestinatario = emailDestinatario;
       this.fechaRegistro = fechaRegistro;
       this.fechaModificacion = fechaModificacion;
       this.paquetesPorTransportes = paquetesPorTransportes;
       this.factura = factura;
       this.estados = estados;
    }
   
    public int getPaqueteId() {
        return this.paqueteId;
    }
    
    public void setPaqueteId(int paqueteId) {
        this.paqueteId = paqueteId;
    }
    public Seguro getSeguro() {
        return this.seguro;
    }
    
    public void setSeguro(Seguro seguro) {
        this.seguro = seguro;
    }
    public Servicio getServicio() {
        return this.servicio;
    }
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }
    public Sucursal getSucursalByDestinoPaquete() {
        return this.sucursalByDestinoPaquete;
    }
    
    public void setSucursalByDestinoPaquete(Sucursal sucursalByDestinoPaquete) {
        this.sucursalByDestinoPaquete = sucursalByDestinoPaquete;
    }
    public Sucursal getSucursalByOrigenPaquete() {
        return this.sucursalByOrigenPaquete;
    }
    
    public void setSucursalByOrigenPaquete(Sucursal sucursalByOrigenPaquete) {
        this.sucursalByOrigenPaquete = sucursalByOrigenPaquete;
    }
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    public BigDecimal getPesoPaquete() {
        return this.pesoPaquete;
    }
    
    public void setPesoPaquete(BigDecimal pesoPaquete) {
        this.pesoPaquete = pesoPaquete;
    }
    public BigDecimal getCostoBasicoPaquete() {
        return this.costoBasicoPaquete;
    }
    
    public void setCostoBasicoPaquete(BigDecimal costoBasicoPaquete) {
        this.costoBasicoPaquete = costoBasicoPaquete;
    }
    public BigDecimal getCostoSinSeguroPaquete() {
        return this.costoSinSeguroPaquete;
    }
    
    public void setCostoSinSeguroPaquete(BigDecimal costoSinSeguroPaquete) {
        this.costoSinSeguroPaquete = costoSinSeguroPaquete;
    }
    public BigDecimal getCostoTotalPaquete() {
        return this.costoTotalPaquete;
    }
    
    public void setCostoTotalPaquete(BigDecimal costoTotalPaquete) {
        this.costoTotalPaquete = costoTotalPaquete;
    }
    public boolean isPagadoPaquete() {
        return this.pagadoPaquete;
    }
    
    public void setPagadoPaquete(boolean pagadoPaquete) {
        this.pagadoPaquete = pagadoPaquete;
    }
    public BigDecimal getDistanciaPaquete() {
        return this.distanciaPaquete;
    }
    
    public void setDistanciaPaquete(BigDecimal distanciaPaquete) {
        this.distanciaPaquete = distanciaPaquete;
    }
    public String getNombreServicio() {
        return this.nombreServicio;
    }
    
    public void setNombreServicio(String nombreServicio) {
        this.nombreServicio = nombreServicio;
    }
    public int getKgPorExcesoPaquete() {
        return this.kgPorExcesoPaquete;
    }
    
    public void setKgPorExcesoPaquete(int kgPorExcesoPaquete) {
        this.kgPorExcesoPaquete = kgPorExcesoPaquete;
    }
    public int getEstampillasPorExcesoServicio() {
        return this.estampillasPorExcesoServicio;
    }
    
    public void setEstampillasPorExcesoServicio(int estampillasPorExcesoServicio) {
        this.estampillasPorExcesoServicio = estampillasPorExcesoServicio;
    }
    public BigDecimal getPrecioBasicoServicio() {
        return this.precioBasicoServicio;
    }
    
    public void setPrecioBasicoServicio(BigDecimal precioBasicoServicio) {
        this.precioBasicoServicio = precioBasicoServicio;
    }
    public Integer getKgBasicoServicio() {
        return this.kgBasicoServicio;
    }
    
    public void setKgBasicoServicio(Integer kgBasicoServicio) {
        this.kgBasicoServicio = kgBasicoServicio;
    }
    public boolean isTieneSeguroPaquete() {
        return this.tieneSeguroPaquete;
    }
    
    public void setTieneSeguroPaquete(boolean tieneSeguroPaquete) {
        this.tieneSeguroPaquete = tieneSeguroPaquete;
    }
    public BigDecimal getMontoAseguradoPaquete() {
        return this.montoAseguradoPaquete;
    }
    
    public void setMontoAseguradoPaquete(BigDecimal montoAseguradoPaquete) {
        this.montoAseguradoPaquete = montoAseguradoPaquete;
    }
    public BigDecimal getComisionSeguroPaquete() {
        return this.comisionSeguroPaquete;
    }
    
    public void setComisionSeguroPaquete(BigDecimal comisionSeguroPaquete) {
        this.comisionSeguroPaquete = comisionSeguroPaquete;
    }
    public BigDecimal getCostoSeguroPaquete() {
        return this.costoSeguroPaquete;
    }
    
    public void setCostoSeguroPaquete(BigDecimal costoSeguroPaquete) {
        this.costoSeguroPaquete = costoSeguroPaquete;
    }
    public int getDniRemitente() {
        return this.dniRemitente;
    }
    
    public void setDniRemitente(int dniRemitente) {
        this.dniRemitente = dniRemitente;
    }
    public String getNombreRemitente() {
        return this.nombreRemitente;
    }
    
    public void setNombreRemitente(String nombreRemitente) {
        this.nombreRemitente = nombreRemitente;
    }
    public String getApellidoRemitente() {
        return this.apellidoRemitente;
    }
    
    public void setApellidoRemitente(String apellidoRemitente) {
        this.apellidoRemitente = apellidoRemitente;
    }
    public String getDirecionRemitente() {
        return this.direcionRemitente;
    }
    
    public void setDirecionRemitente(String direcionRemitente) {
        this.direcionRemitente = direcionRemitente;
    }
    public String getTelefonoRemitinte() {
        return this.telefonoRemitinte;
    }
    
    public void setTelefonoRemitinte(String telefonoRemitinte) {
        this.telefonoRemitinte = telefonoRemitinte;
    }
    public Integer getCodigoPostalRemitente() {
        return this.codigoPostalRemitente;
    }
    
    public void setCodigoPostalRemitente(Integer codigoPostalRemitente) {
        this.codigoPostalRemitente = codigoPostalRemitente;
    }
    public String getEmailRemitente() {
        return this.emailRemitente;
    }
    
    public void setEmailRemitente(String emailRemitente) {
        this.emailRemitente = emailRemitente;
    }
    public int getDniDestinatario() {
        return this.dniDestinatario;
    }
    
    public void setDniDestinatario(int dniDestinatario) {
        this.dniDestinatario = dniDestinatario;
    }
    public String getNombreDestinatario() {
        return this.nombreDestinatario;
    }
    
    public void setNombreDestinatario(String nombreDestinatario) {
        this.nombreDestinatario = nombreDestinatario;
    }
    public String getApellidoDestinatario() {
        return this.apellidoDestinatario;
    }
    
    public void setApellidoDestinatario(String apellidoDestinatario) {
        this.apellidoDestinatario = apellidoDestinatario;
    }
    public String getDirecionDestinatario() {
        return this.direcionDestinatario;
    }
    
    public void setDirecionDestinatario(String direcionDestinatario) {
        this.direcionDestinatario = direcionDestinatario;
    }
    public String getTelefonoDestinatario() {
        return this.telefonoDestinatario;
    }
    
    public void setTelefonoDestinatario(String telefonoDestinatario) {
        this.telefonoDestinatario = telefonoDestinatario;
    }
    public Integer getCodigoPostalDestinatario() {
        return this.codigoPostalDestinatario;
    }
    
    public void setCodigoPostalDestinatario(Integer codigoPostalDestinatario) {
        this.codigoPostalDestinatario = codigoPostalDestinatario;
    }
    public String getEmailDestinatario() {
        return this.emailDestinatario;
    }
    
    public void setEmailDestinatario(String emailDestinatario) {
        this.emailDestinatario = emailDestinatario;
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
    public Set getPaquetesPorTransportes() {
        return this.paquetesPorTransportes;
    }
    
    public void setPaquetesPorTransportes(Set paquetesPorTransportes) {
        this.paquetesPorTransportes = paquetesPorTransportes;
    }
    public Factura getFactura() {
        return this.factura;
    }
    
    public void setFactura(Factura factura) {
        this.factura = factura;
    }
    public Set getEstados() {
        return this.estados;
    }
    
    public void setEstados(Set estados) {
        this.estados = estados;
    }




}


