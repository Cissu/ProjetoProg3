package classes;

public class Paciente {

    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private String dataNasc;
    private Endereco endereco;

    public Paciente(int id, String nome, String rg, String cpf, String dataNasc, Endereco endereco) {
       this.id = id;
       this.nome = nome;
       this.rg = rg;
       this.cpf = cpf;
       this.dataNasc = dataNasc;
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Paciente" + "\nNome: " + nome + "\nId: " + id + "\nRg: " + rg + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNasc + 
                "\nEndereco: " + endereco;
    }

  
  
  
}
