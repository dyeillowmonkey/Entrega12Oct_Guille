package Ejercicio4_Cordenadas;

public class PrincipalTest {
    public static void main(String[] args) {
        // Crear un punto 2D
        Punto punto2D = new Punto(1, 2);

        // Crear un punto 3D
        Punto3D punto3D = new Punto3D(3, 4, 5);

        // Crear un suceso en un punto 3D
        Suceso suceso = new Suceso(6, 7, 8, "Algo sucedió", 10.5);

        // Calcular distancias
        double distancia2D = punto2D.distancia(punto3D);
        double distancia3D = punto3D.distancia(suceso);

        // Comparar puntos y sucesos
        boolean iguales = punto2D.equals(punto3D);
        boolean igualesSuceso = suceso.equals(punto3D);

        // Imprimir resultados
        System.out.println("Distancia 2D-3D: " + distancia2D);
        System.out.println("Distancia 3D-Suceso: " + distancia3D);
        System.out.println("Puntos 2D iguales: " + iguales);
        System.out.println("Suceso igual a Punto3D: " + igualesSuceso);
    }
}
