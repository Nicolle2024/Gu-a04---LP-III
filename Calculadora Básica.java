/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

// Excepción personalizada para división por cero
class DivisionPorCeroException extends Exception {
    public DivisionPorCeroException(String mensaje) {
        super(mensaje);
    }
}

// Clase Calculadora
class Calculadora {
    
    // Método para suma
    public double sumar(double a, double b) {
        return a + b;
    }
    
    // Método para resta
    public double restar(double a, double b) {
        return a - b;
    }
    
    // Método para multiplicación
    public double multiplicar(double a, double b) {
        return a * b;
    }
    
    // Método para división que lanza excepción personalizada
    public double dividir(double a, double b) throws DivisionPorCeroException {
        if (b == 0) {
            throw new DivisionPorCeroException("Error: No se puede dividir por cero");
        }
        return a / b;
    }
}

// Clase principal para probar la calculadora
public class Main {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        
        // Ejemplos de uso
        try {
            System.out.println("Suma: 5 + 3 = " + calc.sumar(5, 3));
            System.out.println("Resta: 10 - 4 = " + calc.restar(10, 4));
            System.out.println("Multiplicación: 6 * 7 = " + calc.multiplicar(6, 7));
            
            // División normal
            System.out.println("División: 15 / 3 = " + calc.dividir(15, 3));
            
            // División por cero - provocará la excepción
            System.out.println("División: 10 / 0 = " + calc.dividir(10, 0));
            
        } catch (DivisionPorCeroException e) {
            System.out.println("Excepción personalizada capturada: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        
        // Más ejemplos con diferentes tipos de error
        try {
            System.out.println("\nProbando más operaciones:");
            System.out.println("División: 20 / 4 = " + calc.dividir(20, 4));
            
            // Esto provocaría ArithmeticException si no fuera por nuestra excepción personalizada
            System.out.println("División: 8 / 0 = " + calc.dividir(8, 0));
            
        } catch (DivisionPorCeroException e) {
            System.out.println("Excepción personalizada: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("Argumento ilegal: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Error aritmético: " + e.getMessage());
        }
        
        System.out.println("\nPrograma terminado correctamente");
    }
}