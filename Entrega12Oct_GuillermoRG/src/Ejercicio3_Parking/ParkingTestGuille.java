package Ejercicio3_Parking;



import java.util.Date;

public class ParkingTestGuille {
   public static void main(String[] args) {
      ParkingVehiculo parking = new ParkingVehiculo("C/ Tolosa n2");
      Vehiculo vehiculo1 = new Vehiculo("1234xd", new Date(), (Date)null);
      Vehiculo vehiculo2 = new Vehiculo("1234REF", new Date(), (Date)null);
      Vehiculo vehiculo3 = new Vehiculo("1234BOY", new Date(), (Date)null);
      Vehiculo vehiculo4 = new Vehiculo("1234TEN", new Date(), (Date)null);
      Vehiculo vehiculo5 = new Vehiculo("1234FIV", new Date(), (Date)null);
      
      parking.aparcaCoche(vehiculo1);
      parking.aparcaCoche(vehiculo2);
      parking.aparcaCoche(vehiculo3);
      parking.aparcaCoche(vehiculo4);
      parking.aparcaCoche(vehiculo5);
      parking.sacaCoche(vehiculo3);
      parking.sacaCoche(vehiculo5);
      parking.sacaCoche(vehiculo1);

    vehiculo1.setFechaFin(new Date());
    System.out.println("Factura de " + vehiculo1.getMatricula() + ": " + parking.getFactura(vehiculo1));
    

   }
}
