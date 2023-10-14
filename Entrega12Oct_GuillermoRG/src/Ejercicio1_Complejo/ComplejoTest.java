package Ejercicio1_Complejo;

public class ComplejoTest {
   public ComplejoTest() {
   }

   public static void main(String[] args) {
      Complejo Complejo1 = new Complejo();
      Complejo Complejo2 = new Complejo();
      Complejo1.asignar(3.0, 10.0);
      Complejo2.asignar(8.0, 2.0);
      Complejo suma = new Complejo();
      suma = suma.sumar(Complejo1, Complejo2);
      suma.imprimir();
   }
}
