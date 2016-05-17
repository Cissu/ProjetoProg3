/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Snowgal
 */
public class PacienteDAO {

    public void create(Paciente p) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into paciente(id, nome, rg, cpf, dataNasc, endereco) values (?,?,?,?,?,?)");
            stmt.setInt(1, p.getId());
            stmt.setString(2, p.getNome());
            stmt.setString(3, p.getRg());
            stmt.setString(4, p.getCpf());
            stmt.setString(5, p.getDataNasc());
            stmt.setObject(6, p.getEndereco());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + e);
        } finally {
            Conectar.closeConnection(con, stmt);

        }

    }
    
        public void update(Paciente p) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("update paciente set nome=?, rg=?, cpf=?, dataNasc=?, endereco=? where id=?");
            //stmt.setInt(1, p.getId());
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getRg());
            stmt.setString(3, p.getCpf());
            stmt.setString(4, p.getDataNasc());
            stmt.setObject(5, p.getEndereco());
            stmt.setInt(6, p.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e);
        } finally {
            Conectar.closeConnection(con, stmt);

        }

    }

}
