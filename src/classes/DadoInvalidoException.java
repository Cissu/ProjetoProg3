package classes;

public class DadoInvalidoException extends Exception {

  DadoInvalidoException(String msg) {
    super("Campo em branco ou inválido");
  }
}
