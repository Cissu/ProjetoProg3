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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Snowgal
 */
public class PacienteDAO {

    public void create(Paciente p) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into paciente(nome, rg, cpf, dataNasc, rua, numero, bairro, cep, cidade) values (?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getRg());
            stmt.setString(3, p.getCpf());
            stmt.setString(4, p.getDataNasc());
            stmt.setObject(5, p.getEndereco().getRua());
            stmt.setObject(6, p.getEndereco().getNumero());
            stmt.setObject(7, p.getEndereco().getBairro());
            stmt.setObject(8, p.getEndereco().getCep());
            stmt.setObject(9, p.getEndereco().getCidade());

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
            stmt = con.prepareStatement("update paciente set nome=?, rg=?, cpf=?, dataNasc=?, rua=?, numero=?, bairro=?, cep=? cidade=? where id=?");
            //stmt.setInt(1, p.getId());
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getRg());
            stmt.setString(3, p.getCpf());
            stmt.setString(4, p.getDataNasc());
             stmt.setObject(5, p.getEndereco().getRua());
            stmt.setObject(6, p.getEndereco().getNumero());
            stmt.setObject(7, p.getEndereco().getBairro());
            stmt.setObject(8, p.getEndereco().getCep());
            stmt.setObject(9, p.getEndereco().getCidade());;
            stmt.setInt(10, p.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e);
        } finally {
            Conectar.closeConnection(con, stmt);

        }

    }

    public void delete(Paciente p) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from paciente where id=?");
            stmt.setInt(1, p.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e);
        } finally {
            Conectar.closeConnection(con, stmt);

        }

    }

}
