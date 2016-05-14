package classes;
// classe de agendamento
public class Agenda {

  private int id;
  private String data;
  private String procedimento;
  private String horario;
  private int pacienteID;
  private int funcID;

  public Agenda (int id, String data, String procedimento, String horario, int pacienteID, int funcID) {
    this.id = id;
    this.data = data;
    this.procedimento = procedimento;
    this.horario = horario;
    this.pacienteID = pacienteID;
    this.funcID = funcID;
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

  public void setData(String data) {
    this.data = data;
  }

  public String getProcedimento() {
    return procedimento;
  }

  public void setProcedimento(String procedimento) {
    this.procedimento = procedimento;
  }

  public String getHorario() {
    return horario;
  }

  public void setHorario(String horario) {
    this.horario = horario;
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

}
