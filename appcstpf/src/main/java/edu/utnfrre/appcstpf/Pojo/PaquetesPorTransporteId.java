package edu.utnfrre.appcstpf.Pojo;
// Generated 09/06/2015 21:03:08 by Hibernate Tools 4.3.1



/**
 * PaquetesPorTransporteId generated by hbm2java
 */
public class PaquetesPorTransporteId  implements java.io.Serializable {


     private int paqueteId;
     private int transporteId;

    public PaquetesPorTransporteId() {
    }

    public PaquetesPorTransporteId(int paqueteId, int transporteId) {
       this.paqueteId = paqueteId;
       this.transporteId = transporteId;
    }
   
    public int getPaqueteId() {
        return this.paqueteId;
    }
    
    public void setPaqueteId(int paqueteId) {
        this.paqueteId = paqueteId;
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
		 if ( !(other instanceof PaquetesPorTransporteId) ) return false;
		 PaquetesPorTransporteId castOther = ( PaquetesPorTransporteId ) other; 
         
		 return (this.getPaqueteId()==castOther.getPaqueteId())
 && (this.getTransporteId()==castOther.getTransporteId());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getPaqueteId();
         result = 37 * result + this.getTransporteId();
         return result;
   }   


}


