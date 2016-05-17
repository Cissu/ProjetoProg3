package repositorio;

import classes.DespesaGanho;
import java.util.ArrayList;

public class RepoReceita {

  ArrayList<DespesaGanho> dg = new ArrayList<>();

  public void addGanho(DespesaGanho v) {
    dg.add(v);
  }

  //Adiciona uma perca ou ganho.
  public double exibirMes(String mes) {
    double v = 0;
    for (int i = 0; i < dg.size(); i++) {
      if (mes == dg.get(i).getMes()) {
        v += dg.get(i).getValor();
      }
    }
    return v;
  }
  
  //Exibi o gasto total
  public double exibirTotal() {
    double v = 0;
    for (int i = 0; i < dg.size(); i++) {
      v += dg.get(i).getValor();
    }
    return v;
  }
  
  //Exibi o gasto de cada paciente
  public double exibirPaciente(int idPaciente) {
    double v = 0;
    for (int i = 0; i < dg.size(); i++) {
      if (idPaciente == dg.get(i).getIdPaciente()) {
        v += dg.get(i).getValor();
      }
    }
    return v;
  }
}
