package classes;

public class Funcionario {

    private int id;
    private String nome;
    private String rg;
    private String cpf;
    private String funcao;
    private double salario;
    private Endereco endereco;

    public Funcionario(String nome, String rg, String cpf, String funcao, double salario, Endereco endereco) throws DadoInvalidoException {
        this.setNome(nome);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setFuncao(funcao);
        this.setSalario(salario);
        this.setEndereco(endereco);
    }

    public Funcionario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

    public void setNome(String nome) throws DadoInvalidoException {
        if (nome.isEmpty() || nome == null) {
            throw new DadoInvalidoException("Campo Nome em branco");
        } else {
            this.nome = nome;
        }
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) throws DadoInvalidoException {
        if (rg.isEmpty() || rg == null) {
            throw new DadoInvalidoException("Campo RG em branco");
        } else {
            this.rg = rg;
        }
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) throws DadoInvalidoException {
        if (cpf.isEmpty() || cpf == null) {
            throw new DadoInvalidoException("Campo CPF em branco");
        } else {
            this.cpf = cpf;
        }
    }
 
    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) throws DadoInvalidoException {
        if (funcao.isEmpty() || funcao == null) {
            throw new DadoInvalidoException("Campo Função em branco");
        } else {
            this.funcao = funcao;
        }
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) throws DadoInvalidoException {
        if (salario < 0) {
            throw new DadoInvalidoException("Campo Salário em branco");
        } else {
            this.salario = salario;
        }
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) throws DadoInvalidoException {
        if (endereco == null) {
            throw new DadoInvalidoException("Por favor preencha os campos do endereço!");
        } else {
            this.endereco = endereco;
        }
    }
}
