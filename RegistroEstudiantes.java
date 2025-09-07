package ACT1LAB4;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class RegistroEstudiantes {
    private List<String> estudiantes;

    public RegistroEstudiantes() {
        estudiantes = new ArrayList<>();
    }

    // Método para agregar un estudiante
    public void agregarEstudiante(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre del estudiante no puede ser nulo o vacío.");
        }
        estudiantes.add(nombre);
    }

    // Método para buscar un estudiante
    public String buscarEstudiante(String nombre) {
        for (String estudiante : estudiantes) {
            if (estudiante.equalsIgnoreCase(nombre)) {
                return estudiante;
            }
        }
        throw new NoSuchElementException("No se encontró el estudiante con nombre: " + nombre);
    }

    // Método auxiliar: mostrar todos los estudiantes
    public void mostrarEstudiantes() {
        System.out.println("Lista de estudiantes: " + estudiantes);
    }
}
