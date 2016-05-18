package classes;

public class DespesaGanho {

  private int id;
  private int idPaciente;
  private String mes;
  private String tipo;
  private double valor;

  public DespesaGanho(int id, int idPaciente, String mes, String tipo, double valor) {
    this.id = id;
    this.idPaciente = idPaciente;
    this.mes = mes;
    this.tipo = tipo;
    this.valor = valor;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public int getIdPaciente() {
    return idPaciente;
  }

  public void setIdPaciente(int idPaciente) {
    this.idPaciente = idPaciente;
  }

  public String getMes() {
    return mes;
  }

  public void setMes(String mes) {
    this.mes = mes;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public double getValor() {
    return valor;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }
}
