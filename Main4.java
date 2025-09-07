package ACT1LAB4;

public class Main4 {
    public static void main(String[] args) {
        RegistroEstudiantes registro = new RegistroEstudiantes();

        // Agregar estudiantes (manejo de IllegalArgumentException)
        try {
            registro.agregarEstudiante("Ana");
            registro.agregarEstudiante("Carlos");
            registro.agregarEstudiante(""); // esto lanzará excepción
        } catch (IllegalArgumentException e) {
            System.out.println("Error al agregar estudiante: " + e.getMessage());
        }

        // Mostrar los estudiantes válidos agregados
        registro.mostrarEstudiantes();

        // Buscar estudiantes (manejo de NoSuchElementException)
        try {
            String encontrado = registro.buscarEstudiante("Carlos");
            System.out.println("Estudiante encontrado: " + encontrado);

            registro.buscarEstudiante("Lucía"); // esto lanzará excepción
        } catch (NoSuchElementException e) {
            System.out.println("Error en la búsqueda: " + e.getMessage());
        }
    }
}
