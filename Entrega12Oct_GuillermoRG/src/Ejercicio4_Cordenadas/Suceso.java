package Ejercicio4_Cordenadas;

class Suceso extends Punto3D {
    private String descripcion;
    private double tiempo;

    public Suceso(int x, int y, int z, String descripcion, double tiempo) {
        super(x, y, z);
        this.descripcion = descripcion;
        this.tiempo = tiempo;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Suceso suceso = (Suceso) obj;
        return Double.compare(suceso.tiempo, tiempo) == 0 && descripcion.equals(suceso.descripcion);
    }
}
