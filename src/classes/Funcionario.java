package classes;

public class Funcionario {

  private int id;
  private String nome;
  private String rg;
  private String cpf;
  private String funcao;
  private double salario;
  private Endereco endereco;

  public Funcionario(int id, String nome, String rg, String cpf, String funcao, double salario, Endereco endereco) {
    this.id = id;
    this.nome = nome;
    this.rg = rg;
    this.cpf = cpf;
    this.funcao = funcao;
    this.salario = salario;
    this.endereco = endereco;
  }

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRg() {
    return rg;
  }

  public void setRg(String rg) {
    this.rg = rg;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public String getFuncao() {
    return funcao;
  }

  public void setFuncao(String funcao) {
    this.funcao = funcao;
  }

  public double getSalario() {
    return salario;
  }

  public void setSalario(double salario) {
    this.salario = salario;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

}
