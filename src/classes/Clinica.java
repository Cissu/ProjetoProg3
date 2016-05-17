package classes;

public class Clinica {

  private String nome;
  private String razaoSocial;
  private String telefone;
  private String cnpj;
  private Endereco endereco;

  public Clinica(String nome, String razaoSocial, String telefone, String cnpj, Endereco endereco) {
    this.nome = nome;
    this.razaoSocial = razaoSocial;
    this.telefone = telefone;
    this.cnpj = cnpj;
    this.endereco = endereco;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getRazaoSocial() {
    return razaoSocial;
  }

  public void setRazaoSocial(String razaoSocial) {
    this.razaoSocial = razaoSocial;
  }

  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public Endereco getEndereco() {
    return endereco;
  }

  public void setEndereco(Endereco endereco) {
    this.endereco = endereco;
  }

    @Override
    public String toString() {
        return "Clinica" + "\nNome: " + nome + "\nRazaoSocial: " + razaoSocial + "\nTelefone: " + telefone + "\nCNPJ: " + cnpj + 
                "\nEndereço: " + endereco + "\n###########\n";
    }
  
  
}
