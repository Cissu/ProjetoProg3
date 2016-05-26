/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.Agendamento;
import classes.DadoInvalidoException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import principal.Agenda;

/**
 *
 * @author Snowgal
 */
public class AgendamentoDAO {
    
  
    public void create(Agendamento a) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into agendamento (nome, procedimento, dentista, especialidade, data, hora) values (?,?,?,?,?,?)");
            stmt.setString(1, a.getNome());
            stmt.setString(2, a.getProcedimento());
            stmt.setString(3, a.getDentista());
            stmt.setString(4, a.getEspecialidade());
            stmt.setString(5, a.getData());
            stmt.setString(6, a.getHora());
            

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException e) {
             JOptionPane.showMessageDialog(null, "Erro ao salvar, " + e);
        }
    }
    
     public List<Agendamento> read() throws DadoInvalidoException {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Agendamento> agendaList = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from agendamento");
            rs = stmt.executeQuery();
            while (rs.next()) {
                
                Agendamento agendas = new Agendamento();
                agendas.setId(rs.getInt("id"));
                agendas.setNome(rs.getString("nome"));
                agendas.setProcedimento(rs.getString("procedimento"));
                agendas.setDentista(rs.getString("dentista"));
                agendas.setEspecialidade(rs.getString("especialidade"));
                agendas.setData(rs.getString("data"));
                agendas.setHora(rs.getString("hora"));
                agendas.setValor(rs.getDouble("valor"));
                
                agendaList.add(agendas);
            }
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conectar.closeConnection(con, stmt, rs);
        }
        return agendaList;
    }
    
}
