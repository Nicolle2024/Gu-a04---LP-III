package ACT1LAB4;

//Clase Numero
public class Numero {
 private double valor;

 // Constructor
 public Numero(double valor) {
     setValor(valor); // validación desde el inicio
 }

 // Método para establecer el valor
 public void setValor(double valor) {
     if (valor < 0) {
         throw new IllegalArgumentException("El valor no puede ser negativo: " + valor);
     }
     this.valor = valor;
 }

 // Método para obtener el valor
 public double getValor() {
     return valor;
 }
}

