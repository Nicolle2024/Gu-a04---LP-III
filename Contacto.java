package ACT1LAB4;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;
    private Direccion direccion;
    private Empresa empresa;

    public Contacto(String nombre, String telefono, String email, Direccion direccion, Empresa empresa) {
        setNombre(nombre);
        setTelefono(telefono);
        setEmail(email);
        this.direccion = direccion;
        this.empresa = empresa;
    }

    // Getters y Setters con validaciones
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono == null || !telefono.matches("\\d{7,15}")) {
            throw new IllegalArgumentException("El teléfono debe contener entre 7 y 15 dígitos.");
        }
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.contains("@")) {
            throw new IllegalArgumentException("El email no es válido.");
        }
        this.email = email;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    @Override
    public String toString() {
        return "Contacto{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", email='" + email + '\'' +
                ", direccion=" + direccion +
                ", empresa=" + empresa +
                '}';
    }
}
