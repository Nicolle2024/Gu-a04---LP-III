package ACT1LAB4;

public class Empresa {
    private String nombre;
    private String sector;

    public Empresa(String nombre, String sector) {
        this.nombre = nombre;
        this.sector = sector;
    }

    @Override
    public String toString() {
        return nombre + " (" + sector + ")";
    }
}

