package Ejercicio2_Ordenadores;

public class Sobremesa {
    
    int codigo;
    int RAM;
    String cpu;
    double precio;
    
    public Sobremesa(int codigo, int RAM, String cpu, double precio, String tipoTorre) {
        this.codigo = codigo;
        this.RAM = RAM;
        this.cpu = cpu;
        this.precio = precio;
        this.tipoTorre = tipoTorre;
    }

    String tipoTorre;

    public String getCaractetisticasSobremesa(){
        String caracteristica = "Código: "+codigo;
        caracteristica +=  "RAM:"+RAM+"GB";
        caracteristica += " CPU:"+cpu;
        caracteristica += " Precio:"+precio+"€";
        caracteristica += " ¿Cuál es el tipo de Torre?: "+tipoTorre; 
            return caracteristica;
            
    }

}
