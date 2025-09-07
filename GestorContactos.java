package ACT1LAB4;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class GestorContactos {
    private List<Contacto> contactos;

    public GestorContactos() {
        contactos = new ArrayList<>();
    }

    // Agregar un contacto
    public void agregarContacto(Contacto contacto) {
        if (contacto == null) {
            throw new IllegalArgumentException("El contacto no puede ser nulo.");
        }
        contactos.add(contacto);
    }

    // Buscar contacto por nombre
    public Contacto buscarContacto(String nombre) {
        for (Contacto c : contactos) {
            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }
        throw new NoSuchElementException("No se encontró el contacto con nombre: " + nombre);
    }

    // Modificar contacto
    public void modificarContacto(String nombre, String nuevoTelefono, String nuevoEmail) {
        Contacto c = buscarContacto(nombre);
        try {
            if (nuevoTelefono != null) c.setTelefono(nuevoTelefono);
            if (nuevoEmail != null) c.setEmail(nuevoEmail);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al modificar contacto: " + e.getMessage());
        }
    }

    // Eliminar contacto
    public void eliminarContacto(String nombre) {
        Contacto c = buscarContacto(nombre);
        contactos.remove(c);
    }

    // Mostrar todos los contactos
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("No hay contactos registrados.");
        } else {
            for (Contacto c : contactos) {
                System.out.println(c);
            }
        }
    }
}
