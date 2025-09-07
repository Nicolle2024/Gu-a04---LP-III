package ACT1LAB4;

public class Main5 {
    public static void main(String[] args) {
        GestorContactos gestor = new GestorContactos();

        try {
            Direccion dir1 = new Direccion("Av. Siempre Viva 123", "Springfield", "USA");
            Empresa emp1 = new Empresa("Globex", "Tecnología");
            Contacto c1 = new Contacto("Homer Simpson", "123456789", "homer@springfield.com", dir1, emp1);

            gestor.agregarContacto(c1);
            gestor.mostrarContactos();

            // Intento de agregar contacto inválido
            gestor.agregarContacto(new Contacto("", "999", "correo", dir1, emp1));
        } catch (IllegalArgumentException e) {
            System.out.println("Error al crear o agregar contacto: " + e.getMessage());
        }

        // Modificar un contacto existente
        try {
            gestor.modificarContacto("Homer Simpson", "987654321", "homer@gmail.com");
        } catch (NoSuchElementException e) {
            System.out.println("Error al modificar: " + e.getMessage());
        }

        gestor.mostrarContactos();

        // Intentar eliminar contacto que no existe
        try {
            gestor.eliminarContacto("Marge Simpson");
        } catch (NoSuchElementException e) {
            System.out.println("Error al eliminar: " + e.getMessage());
        }
    }
}
