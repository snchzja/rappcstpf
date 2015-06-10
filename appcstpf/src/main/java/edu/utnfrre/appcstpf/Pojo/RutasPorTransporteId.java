package edu.utnfrre.appcstpf.Pojo;
// Generated 09/06/2015 21:03:08 by Hibernate Tools 4.3.1



/**
 * RutasPorTransporteId generated by hbm2java
 */
public class RutasPorTransporteId  implements java.io.Serializable {


     private int sucursalOrigen;
     private int secursalDestino;
     private int transporteId;

    public RutasPorTransporteId() {
    }

    public RutasPorTransporteId(int sucursalOrigen, int secursalDestino, int transporteId) {
       this.sucursalOrigen = sucursalOrigen;
       this.secursalDestino = secursalDestino;
       this.transporteId = transporteId;
    }
   
    public int getSucursalOrigen() {
        return this.sucursalOrigen;
    }
    
    public void setSucursalOrigen(int sucursalOrigen) {
        this.sucursalOrigen = sucursalOrigen;
    }
    public int getSecursalDestino() {
        return this.secursalDestino;
    }
    
    public void setSecursalDestino(int secursalDestino) {
        this.secursalDestino = secursalDestino;
    }
    public int getTransporteId() {
        return this.transporteId;
    }
    
    public void setTransporteId(int transporteId) {
        this.transporteId = transporteId;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof RutasPorTransporteId) ) return false;
		 RutasPorTransporteId castOther = ( RutasPorTransporteId ) other; 
         
		 return (this.getSucursalOrigen()==castOther.getSucursalOrigen())
 && (this.getSecursalDestino()==castOther.getSecursalDestino())
 && (this.getTransporteId()==castOther.getTransporteId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getSucursalOrigen();
         result = 37 * result + this.getSecursalDestino();
         result = 37 * result + this.getTransporteId();
         return result;
   }   


}

