package classes;

public class DespesaGanho {

  private String descricao;
  private String tipo;
  private double valor;
  private String data;

  public DespesaGanho(String descricao, String tipo, double valor) {

    this.descricao = descricao;
    this.tipo = tipo;
    this.valor = valor;
  }

    public DespesaGanho() {
        
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    
    
  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
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
