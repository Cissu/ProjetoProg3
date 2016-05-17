package classes;

public class Dentista extends Funcionario {

  private String cro;
  private String especialidade;

  public Dentista(String cro, String especialidade, int id, String nome, String rg, String cpf, String funcao, double salario, Endereco endereco) {
    super(id, nome, rg, cpf, funcao, salario, endereco);
    this.cro = cro;
    this.especialidade = especialidade;
  }

  public String getCro() {
    return cro;
  }

  public void setCro(String cro) {
    this.cro = cro;
  }

  public String getEspecialidade() {
    return especialidade;
  }

  public void setEspecialidade(String especialidade) {
    this.especialidade = especialidade;
  }

    @Override
    public String toString() {
        return "Dentista" + "\nNome: " + super.getNome() + "\nCRO: " + cro + "\nEspecialidade: " + especialidade + "\nID: " + super.getId() + "" + "\n###########\n";
    }
    
}
