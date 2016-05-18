package classes;

public class Procedimento {

    private int id;
    private String nome;
    private double valor;

    public Procedimento(int id, String nome, double valor) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
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

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
