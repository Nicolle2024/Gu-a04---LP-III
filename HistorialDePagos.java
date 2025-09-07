package ACT1LAB4;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class HistorialDePagos {
    private List<Pago> pagos;

    public HistorialDePagos() {
        this.pagos = new ArrayList<>();
    }

    public void registrarPago(LocalDate fecha, double monto) throws PagoInvalidoException {
        if (fecha.isAfter(LocalDate.now())) {
            throw new PagoInvalidoException("La fecha del pago no puede ser futura.");
        }
        if (monto <= 0) {
            throw new PagoInvalidoException("El monto del pago debe ser positivo.");
        }
        pagos.add(new Pago(fecha, monto));
    }

    public void mostrarPagos() {
        if (pagos.isEmpty()) {
            System.out.println("No hay pagos registrados.");
        } else {
            pagos.forEach(System.out::println);
        }
    }

    // Clase interna para representar un pago
    private static class Pago {
        private LocalDate fecha;
        private double monto;

        public Pago(LocalDate fecha, double monto) {
            this.fecha = fecha;
            this.monto = monto;
        }

        @Override
        public String toString() {
            return "Pago{" +
                    "fecha=" + fecha +
                    ", monto=" + monto +
                    '}';
        }
    }
}
