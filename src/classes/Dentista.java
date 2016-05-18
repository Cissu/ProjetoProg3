package classes;

public class Dentista extends Funcionario {

    private String cro;
    private String especialidade;

    public Dentista(int id, String cro, String especialidade, String nome, String rg, String cpf, String funcao, double salario, Endereco endereco) throws DadoInvalidoException {
        super(id, nome, rg, cpf, funcao, salario, endereco);
        this.setCro(cro);
        this.setEspecialidade(especialidade);
    }

    public String getCro() {
        return cro;
    }

    public void setCro(String cro) throws DadoInvalidoException {
        if (cro.isEmpty() || cro == null) {
            throw new DadoInvalidoException("Campo Dada em branco");
        } else {
            this.cro = cro;
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws DadoInvalidoException {
        if (cro.isEmpty() || cro == null) {
            throw new DadoInvalidoException("Campo Especialidade em branco");
        } else {
            this.especialidade = especialidade;
        }
    }

    @Override
    public String toString() {
        return "Dentista" + "\nNome: " + super.getNome() + "\nCRO: " + cro + "\nEspecialidade: " + especialidade + "\nID: " + super.getId() + "" + "\n###########\n";
    }

}
