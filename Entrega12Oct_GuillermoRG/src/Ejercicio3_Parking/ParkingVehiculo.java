package Ejercicio3_Parking;

public class ParkingVehiculo implements Parking {
   private static final double precioxMin = 0.0425;
   private static final int plazasMaximas = 100;
   private String direccion;
   private int plazasOcupadas;

   public ParkingVehiculo(String direccion) {
      this.direccion = direccion;
      this.plazasOcupadas = 0;
   }

   public boolean hayPlaza() {
        if(plazasMaximas <= 100){
            
        }
        return true;
      
   }

   public void aparcaCoche(Vehiculo coche) {
      if (this.hayPlaza()) {
         ++this.plazasOcupadas;
         System.out.println("El vehículo con matricula " + coche.getMatricula() + " ha sido aparcado en " + this.direccion);
      } else {
         System.out.println("No hay plazas disponibles en " + this.direccion);
      }

   }

   public void sacaCoche(Vehiculo coche) {
      --this.plazasOcupadas;
      System.out.println("El vehículo con matricula " + coche.getMatricula() + " ha salido del parking " + this.direccion);
   }

   public double getFactura(Vehiculo coche) {
      double tiempoEstacionamiento = (double)(coche.getFechaFin().getTime() - coche.getFechaInicio().getTime()) / 60000.0;
      return tiempoEstacionamiento * precioxMin;
   }
}