package ACT1LAB4;

public class Propiedad {
    private String direccion;
    private double precio;
    private double tamano; // metros cuadrados

    public Propiedad(String direccion, double precio, double tamano) throws DatosInvalidosException {
        if (precio <= 0 || tamano <= 0) {
            throw new DatosInvalidosException("El precio y el tamaño deben ser positivos.");
        }
        this.direccion = direccion;
        this.precio = precio;
        this.tamano = tamano;
    }

    public String getDireccion() {
        return direccion;
    }

    public double getPrecio() {
        return precio;
    }

    public double getTamano() {
        return tamano;
    }

    @Override
    public String toString() {
        return "Propiedad{" +
                "direccion='" + direccion + '\'' +
                ", precio=" + precio +
                ", tamaño=" + tamano +
                '}';
    }
}
