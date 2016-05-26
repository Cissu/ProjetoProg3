/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author Snowgal
 */
public class Agendamento {
    private int id;
    private String nome;
    private String procedimento;
    private String dentista;
    private String especialidade;
    private String data;
    private String hora;
    
    public Agendamento(String nome, String procedimento, String dentista, String data, String hora) throws DadoInvalidoException {
        this.setNome(nome);
        this.setProcedimento(procedimento);
        this.setDentista(dentista);
        this.setData(data);
        this.setHora(hora);
    }

    public Agendamento() {
        
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
            throw new DadoInvalidoException("Campo nome em branco");
        } else {
            this.nome = nome;
        }
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) throws DadoInvalidoException {
        if (procedimento.isEmpty() || procedimento == null) {
            throw new DadoInvalidoException("Campo procedimento em branco");
        } else {
            this.procedimento = procedimento;
        }
    }

    public String getDentista() {
        return dentista;
    }

    public void setDentista(String dentista) throws DadoInvalidoException {
         if (dentista.isEmpty() || dentista == null) {
            throw new DadoInvalidoException("Campo dentista em branco");
        } else {
            this.dentista = dentista;
        }
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) throws DadoInvalidoException {
        if (especialidade.isEmpty() || especialidade == null) {
            throw new DadoInvalidoException("Campo especialidade em branco");
        } else {
            this.especialidade = especialidade;
        }
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) throws DadoInvalidoException {
        if (data.isEmpty() || data == null) {
            throw new DadoInvalidoException("Campo data em branco");
        } else {
            this.data = data;
        }
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) throws DadoInvalidoException {
         if (hora.isEmpty() || hora == null) {
            throw new DadoInvalidoException("Campo hora em branco");
        } else {
            this.hora = hora;
        }
    }

}
