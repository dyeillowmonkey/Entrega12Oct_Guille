package Ejercicio2_Ordenadores;

public class OrdenadorTestGuille {
    public static void main(String[] args) {
        Sobremesa Sobremesa1 = new Sobremesa(1,16,"Intel i8700K",700.0,"atx");
        Portatiles Portatil1 = new Portatiles(1, 8, "Ryzen 5", 450.0, 17.3);


        System.out.println(Portatil1.getCaractetisticasPortatil());
        System.out.println("-------------------------------------------");
        System.out.println(Sobremesa1.getCaractetisticasSobremesa());
        
    }
}
