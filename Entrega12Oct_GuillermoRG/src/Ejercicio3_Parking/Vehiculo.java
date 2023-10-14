package Ejercicio3_Parking;

import java.util.Date;

public class Vehiculo {
   private String matricula;
   private Date fechaInicio;
   private Date fechaFin;

   public Vehiculo(String matricula, Date fechaInicio, Date fechaFin) {
      this.matricula = matricula;
      this.fechaInicio = fechaInicio;
      this.fechaFin = fechaFin;
   }

   public String getMatricula() {
      return this.matricula;
   }

   public Date getFechaInicio() {
      return this.fechaInicio;
   }

   public Date getFechaFin() {
      return this.fechaFin;
   }

   public void setFechaFin(Date fechaFin) {
      this.fechaFin = fechaFin;
   }

   public String toString() {
      return "Veh\u00edculo [Matr\u00edcula: " + this.matricula + ", Fecha inicio: " + this.fechaInicio + ", Fecha fin: " + this.fechaFin + "]";
   }
}