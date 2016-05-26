/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.Agendamento;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
    
}
