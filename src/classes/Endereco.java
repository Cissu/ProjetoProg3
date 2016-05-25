package classes;

public class Endereco {

    private String rua;
    private String numero;
    private String cep;
    private String bairro;
    private String cidade;

    public Endereco(String rua, String numero, String cep, String bairro, String cidade) throws DadoInvalidoException {
        this.setRua(rua);
        this.setNumero(numero);
        this.setCep(cep);
        this.setBairro(bairro);
        this.setCidade(cidade);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) throws DadoInvalidoException {
        if (rua.isEmpty() || rua == null) {
            throw new DadoInvalidoException("Campo Rua em branco");
        } else {
            this.rua = rua;
        }
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) throws DadoInvalidoException {
        if (numero.isEmpty() || numero == null) {
            throw new DadoInvalidoException("Campo Número em branco");
        } else {
            this.numero = numero;
        }
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) throws DadoInvalidoException {
        if (cep.isEmpty() || cep == null) {
            throw new DadoInvalidoException("Campo CEP em branco");
        } else {
            this.cep = cep;
        }
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) throws DadoInvalidoException {
        if (bairro.isEmpty() || bairro == null) {
            throw new DadoInvalidoException("Campo Bairro em branco");
        } else {
            this.bairro = bairro;
        }
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) throws DadoInvalidoException {
        if (cidade.isEmpty() || cidade == null) {
            throw new DadoInvalidoException("Campo Cidade em branco");
        } else {
            this.cidade = cidade;
        }
    }

    @Override
    public String toString() {
        return "Rua: " + rua + "\nNúmero: " + numero + "\nBairro: " + bairro + "\nCEP: " + cep + "\nCidade: " + cidade + "\n###########\n";
    }

}
