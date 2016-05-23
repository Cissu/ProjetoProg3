package classes;

public class Paciente {
    private String nome;
    private String rg;
    private String cpf;
    private String dataNasc;
    private Endereco endereco;

    public Paciente(String nome, String rg, String cpf, String dataNasc, Endereco endereco) throws DadoInvalidoException {
        this.setNome(nome);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setDataNasc(dataNasc);
        this.setEndereco(endereco);
    }

    public Paciente() {
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) throws DadoInvalidoException {
        if (nome.isEmpty() || nome == null) {
            throw new DadoInvalidoException("Campo nome em branco");
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

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) throws DadoInvalidoException {
        if (dataNasc.isEmpty() || dataNasc == null) {
            throw new DadoInvalidoException("Campo Data de Nascimento em branco");
        } else {
            this.dataNasc = dataNasc;
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

    @Override
    public String toString() {
        return "Paciente" + "\nNome: " + nome + rg + "\nCPF: " + cpf + "\nData de Nascimento: " + dataNasc
                + "\nEndereco: " + endereco;
    }
}
