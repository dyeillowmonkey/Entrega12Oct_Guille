package Ejercicio3_Parking;

public interface Parking {
   boolean hayPlaza();

   void aparcaCoche(Vehiculo var1);

   void sacaCoche(Vehiculo var1);

   double getFactura(Vehiculo var1);
}
