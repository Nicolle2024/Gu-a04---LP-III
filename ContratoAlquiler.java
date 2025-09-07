package ACT1LAB4;

public class ContratoAlquiler {
    private int duracionMeses;
    private double montoAlquiler;

    public ContratoAlquiler(int duracionMeses, double montoAlquiler) throws ContratoInvalidoException {
        setDuracionMeses(duracionMeses);
        setMontoAlquiler(montoAlquiler);
    }

    public void setDuracionMeses(int duracionMeses) throws ContratoInvalidoException {
        if (duracionMeses <= 0) {
            throw new ContratoInvalidoException("La duración del contrato debe ser positiva.");
        }
        this.duracionMeses = duracionMeses;
    }

    public void setMontoAlquiler(double montoAlquiler) throws ContratoInvalidoException {
        if (montoAlquiler <= 0) {
            throw new ContratoInvalidoException("El monto del alquiler debe ser mayor a 0.");
        }
        this.montoAlquiler = montoAlquiler;
    }

    @Override
    public String toString() {
        return "ContratoAlquiler{" +
                "duración=" + duracionMeses + " meses" +
                ", montoAlquiler=" + montoAlquiler +
                '}';
    }
}
