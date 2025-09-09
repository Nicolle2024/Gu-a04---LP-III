/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

// Clases de excepción personalizadas
class VocalException extends Exception {
    public VocalException(String mensaje) {
        super(mensaje);
    }
}

class NumeroException extends Exception {
    public NumeroException(String mensaje) {
        super(mensaje);
    }
}

class BlancoException extends Exception {
    public BlancoException(String mensaje) {
        super(mensaje);
    }
}

class SalidaException extends Exception {
    public SalidaException(String mensaje) {
        super(mensaje);
    }
}

// Clase LeerEntrada (proporcionada)
class LeerEntrada {
    private Reader stream;

    /**
     * Constructor
     *
     * @param fuente la fuente de datos
     */
    public LeerEntrada(InputStream fuente) {
        stream = new InputStreamReader(fuente);
    }

    /**
     * Obtiene el siguiente carácter del teclado.
     *
     * @return el carácter escrito
     * @throws IOException
     */
    public char getChar() throws IOException {
        return (char) this.stream.read();
    }
}

// Clase principal que procesa los caracteres
public class ProcesadorCaracteres {
    private LeerEntrada lector;

    /**
     * Constructor
     */
    public ProcesadorCaracteres() {
        this.lector = new LeerEntrada(System.in);
    }

    /**
     * Procesa el carácter leído y lanza la excepción correspondiente
     *
     * @param c el carácter a procesar
     * @throws VocalException si es una vocal
     * @throws NumeroException si es un número
     * @throws BlancoException si es un espacio en blanco
     * @throws SalidaException si es el carácter de salida 's'
     */
    public void procesar(char c) throws VocalException, NumeroException, BlancoException, SalidaException {
        // Convertir a minúscula para simplificar la verificación de vocales
        char caracter = Character.toLowerCase(c);
        
        // Verificar si es vocal
        if (caracter == 'a' || caracter == 'e' || caracter == 'i' || 
            caracter == 'o' || caracter == 'u') {
            throw new VocalException("Excepción de vocal: '" + c + "'");
        }
        
        // Verificar si es número
        if (Character.isDigit(c)) {
            throw new NumeroException("Excepción de número: '" + c + "'");
        }
        
        // Verificar si es espacio en blanco
        if (Character.isWhitespace(c)) {
            throw new BlancoException("Excepción de blanco: '" + c + "'");
        }
        
        // Verificar si es carácter de salida ('s' o 'S')
        if (caracter == 's') {
            throw new SalidaException("Excepción de salida: '" + c + "'");
        }
    }

    /**
     * Método main principal
     */
    public static void main(String[] args) {
        ProcesadorCaracteres procesador = new ProcesadorCaracteres();
        
        System.out.println("Sistema de procesamiento de caracteres");
        System.out.println("Ingrese caracteres (presione 's' para salir):");
        
        boolean continuar = true;
        
        while (continuar) {
            try {
                // Leer carácter
                char caracter = procesador.lector.getChar();
                
                // Procesar carácter
                procesador.procesar(caracter);
                
                // Si no se lanzó excepción, el carácter es válido pero no especial
                System.out.println("Carácter procesado: '" + caracter + "'");
                
            } catch (VocalException e) {
                System.out.println(e.getMessage());
            } catch (NumeroException e) {
                System.out.println(e.getMessage());
            } catch (BlancoException e) {
                System.out.println(e.getMessage());
            } catch (SalidaException e) {
                System.out.println(e.getMessage());
                System.out.println("Saliendo del programa...");
                continuar = false;
            } catch (IOException e) {
                System.out.println("Error de entrada/salida: " + e.getMessage());
                continuar = false;
            }
        }
    }
}