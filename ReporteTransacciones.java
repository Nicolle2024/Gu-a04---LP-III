package ACT1LAB4;

import java.io.*;
import java.util.*;

public class ReporteTransacciones {
    private List<String> historial = new ArrayList<>();

    // Agregar registro de transacción
    public void registrarTransaccion(String transaccion) {
        historial.add(transaccion);
    }

    // Generar reporte en archivo de texto
    public void generarReporte(String nombreArchivo, CuentaBancaria cuenta) 
            throws HistorialVacioException, IOException {
        if (historial.isEmpty()) {
            throw new HistorialVacioException("No hay transacciones para generar el reporte.");
        }

        // Manejo de recursos con try-with-resources
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(nombreArchivo))) {
            writer.write("Reporte de cuenta: " + cuenta.getNumeroCuenta() + "\n");
            writer.write("Titular: " + cuenta.getTitular() + "\n");
            writer.write("Saldo actual: " + cuenta.getSaldo() + "\n");
            writer.write("Historial de transacciones:\n");
            for (String t : historial) {
                writer.write("- " + t + "\n");
            }
        }
    }

    // Leer archivo de transacciones
    public void leerReporte(String nombreArchivo) throws FileNotFoundException {
        try (Scanner scanner = new Scanner(new File(nombreArchivo))) {
            System.out.println("=== LEYENDO REPORTE ===");
            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
        }
    }
}
