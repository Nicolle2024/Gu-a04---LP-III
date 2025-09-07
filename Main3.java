package ACT1LAB4;

public class Main3 {
    public static void main(String[] args) {
        try {
            Numero num1 = new Numero(10.5);
            System.out.println("Número inicial: " + num1.getValor());

            // Intento de asignar un número negativo
            num1.setValor(-7.3);
        } catch (IllegalArgumentException e) {
            System.out.println("Error al asignar valor: " + e.getMessage());
        }

        // Otro ejemplo para comprobar que funciona con valores positivos
        try {
            Numero num2 = new Numero(5.0);
            System.out.println("Número válido: " + num2.getValor());
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
