package ACT1LAB4;

import java.time.LocalDate;

public class Main6 {
    public static void main(String[] args) {
        try {
            // Crear propiedad
            Propiedad propiedad = new Propiedad("Av. Principal 123", 100000, 120);
            System.out.println(propiedad);

            // Crear transacción válida
            TransaccionInmobiliaria transaccion =
                    new TransaccionInmobiliaria(1, propiedad, 120000);
            System.out.println(transaccion);

            // Intentar contrato inválido
            try {
                ContratoAlquiler contrato = new ContratoAlquiler(0, 5000);
            } catch (ContratoInvalidoException e) {
                System.out.println("Error en contrato: " + e.getMessage());
            }

            // Crear historial de pagos
            HistorialDePagos historial = new HistorialDePagos();
            historial.registrarPago(LocalDate.now().minusDays(2), 1500);
            historial.registrarPago(LocalDate.now(), 2000);

            // Intentar pago futuro
            try {
                historial.registrarPago(LocalDate.now().plusDays(5), 1000);
            } catch (PagoInvalidoException e) {
                System.out.println("Error en pago: " + e.getMessage());
            }

            historial.mostrarPagos();

        } catch (DatosInvalidosException | PrecioInferiorException | PagoInvalidoException e) {
            System.out.println("Error general: " + e.getMessage());
        }
    }
}

