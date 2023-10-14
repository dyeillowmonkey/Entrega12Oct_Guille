package Ejercicio4_Cordenadas;

class Punto3D extends Punto {
    private int z;

    public Punto3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public double distancia(Punto otroPunto) {
        if (otroPunto instanceof Punto3D) {
            Punto3D punto3D = (Punto3D) otroPunto;
            int dx = this.x - punto3D.x;
            int dy = this.y - punto3D.y;
            int dz = this.z - punto3D.z;
            return Math.sqrt(dx * dx + dy * dy + dz * dz);
        }
        return super.distancia(otroPunto);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Punto3D otroPunto = (Punto3D) obj;
        return z == otroPunto.z;
    }
}
