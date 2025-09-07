package ACT1LAB4;

//Excepción para datos inválidos en la propiedad
class DatosInvalidosException extends Exception {
 public DatosInvalidosException(String mensaje) {
     super(mensaje);
 }
}

//Excepción para precio inferior en transacción
class PrecioInferiorException extends Exception {
 public PrecioInferiorException(String mensaje) {
     super(mensaje);
 }
}

//Excepción para contrato inválido
class ContratoInvalidoException extends Exception {
 public ContratoInvalidoException(String mensaje) {
     super(mensaje);
 }
}

//Excepción para pago inválido
class PagoInvalidoException extends Exception {
 public PagoInvalidoException(String mensaje) {
     super(mensaje);
 }
}
