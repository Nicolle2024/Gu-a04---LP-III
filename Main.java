package ACT1LAB4;

public class Main {
    public static void main(String[] args) {
        try {
            // Crear cuentas
            CuentaBancaria cuenta1 = new CuentaBancaria("001", "Juan Pérez", 500);
            CuentaCredito cuenta2 = new CuentaCredito("002", "Ana López", 100, 300);

            // Reportes
            ReporteTransacciones reporte = new ReporteTransacciones();

            // Depósito válido
            cuenta1.depositar(200);
            reporte.registrarTransaccion("Depósito de 200 a cuenta 001");

            // Retiro válido
            cuenta1.retirar(100);
            reporte.registrarTransaccion("Retiro de 100 de cuenta 001");

            // Transferencia válida
            cuenta1.transferir(cuenta2, 300);
            reporte.registrarTransaccion("Transferencia de 300 de cuenta 001 a cuenta 002");

            // Retiro en cuenta de crédito (usando el límite)
            cuenta2.retirar(350);
            reporte.registrarTransaccion("Retiro de 350 de cuenta 002 con crédito");

            // Generar reporte
            reporte.generarReporte("reporte.txt", cuenta1);

            // Leer reporte
            reporte.leerReporte("reporte.txt");

            // Intentar cerrar cuenta con saldo != 0
            cuenta1.cerrarCuenta();

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
