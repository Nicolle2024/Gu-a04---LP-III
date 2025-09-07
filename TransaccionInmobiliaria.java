package ACT1LAB4;

public class TransaccionInmobiliaria {
    private int id;
    private Propiedad propiedad;
    private double precioTransaccion;

    public TransaccionInmobiliaria(int id, Propiedad propiedad, double precioTransaccion)
            throws PrecioInferiorException {
        if (precioTransaccion < propiedad.getPrecio()) {
            throw new PrecioInferiorException(
                    "El precio de la transacción no puede ser menor al precio de la propiedad.");
        }
        this.id = id;
        this.propiedad = propiedad;
        this.precioTransaccion = precioTransaccion;
    }

    @Override
    public String toString() {
        return "Transacción{" +
                "id=" + id +
                ", propiedad=" + propiedad +
                ", precioTransaccion=" + precioTransaccion +
                '}';
    }
}
