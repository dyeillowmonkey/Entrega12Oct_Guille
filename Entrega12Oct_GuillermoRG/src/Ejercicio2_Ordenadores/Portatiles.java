package Ejercicio2_Ordenadores;

public class Portatiles {
    int codigo;
    int RAM;
    String cpu;
    double precio;
    double peso;
   
    public Portatiles(int codigo, int RAM, String cpu, double precio, double peso) {
        this.codigo = codigo;
        this.RAM = RAM;
        this.cpu = cpu;
        this.precio = precio;
        this.peso = peso;
    }

    public String getCaractetisticasPortatil(){
        String caracteristica = "Código:"+codigo;
        caracteristica += " RAM:"+RAM+"GB";
        caracteristica += " CPU:"+cpu;
        caracteristica += " Precio:"+precio+"€";
        caracteristica += " Peso:"+peso+"Kg"; 
            return caracteristica;
            
    }
    

}
