package Ejercicio1_Complejo;

public class Complejo {
   double dPReal;
   double dPImag;


   public double getdPReal() {
      return this.dPReal;
   }

   public void setdPReal(double dPReal) {
      this.dPReal = dPReal;
   }

   public double getdPImag() {
      return this.dPImag;
   }

   public void setdPImag(double dPImag) {
      this.dPImag = dPImag;
   }

   void asignar(double x, double y) {
      this.dPReal = x;
      this.dPImag = y;
   }

   Complejo sumar(Complejo c1, Complejo c2) {
      Complejo c3 = new Complejo();
      c3.asignar(c1.getdPReal() + c2.getdPReal(), c1.getdPImag() + c2.getdPImag());
      return c3;
   }

   void imprimir() {
      System.out.println("[NumReal] " + this.dPReal + "[NumImaginario] " + this.dPImag);
   }
}
