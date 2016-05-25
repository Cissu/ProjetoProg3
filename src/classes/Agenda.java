package classes;
// classe de agendamento

import java.util.Objects;

public class Agenda {

    private int id;
    private String data;
    private String procedimento;
    private String horario;
    private int pacienteID;
    private int funcID;

    public Agenda(int id, String data, String procedimento, String horario, int pacienteID, int funcID) throws DadoInvalidoException {
        this.id = id;
        this.setData(data);
        this.setProcedimento(procedimento);
        this.setHorario(horario);
        this.pacienteID = pacienteID;
        this.funcID = funcID;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.data);
        hash = 89 * hash + Objects.hashCode(this.procedimento);
        hash = 89 * hash + Objects.hashCode(this.horario);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Agenda other = (Agenda) obj;
        if (!Objects.equals(this.data, other.data)) {
            return false;
        }
        if (!Objects.equals(this.procedimento, other.procedimento)) {
            return false;
        }
        if (!Objects.equals(this.horario, other.horario)) {
            return false;
        }
        return true;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) throws DadoInvalidoException {
        if (data.isEmpty() || data == null) {
            throw new DadoInvalidoException("Campo Dada em branco");
        } else {
            this.data = data;
        }
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) throws DadoInvalidoException {
        if (procedimento.isEmpty() || data == null) {
            throw new DadoInvalidoException("Campo Procedimento em branco");
        } else {
            this.procedimento = procedimento;
        }
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) throws DadoInvalidoException {
        if (horario.isEmpty() || data == null) {
            throw new DadoInvalidoException("Campo Horário em branco");
        } else {
            this.horario = horario;
        }
    }

    public int getPacienteID() {
        return pacienteID;
    }

    public void setPacienteID(int pacienteID) {
        this.pacienteID = pacienteID;
    }

    public int getFuncID() {
        return funcID;
    }

    public void setFuncID(int funcID) {
        this.funcID = funcID;
    }

    @Override
    public String toString() {
        return "Agendamento" + "\nID: " + id + "\nData: " + data + "\nProcedimento: " + procedimento + "\nHorario: " + horario + "\nPacienteID: " + pacienteID + "\nID do Funcionário: "
                + funcID + "\n###########\n";
    }

}
