/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Snowgal
 */
public class FuncionarioDAO {

    public void create(Funcionario f) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into funcionario (nome, rg, cpf, funcao, salario, rua, numero, bairro, cep, cidade) values (?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getRg());
            stmt.setString(3, f.getCpf());
            stmt.setString(4, f.getFuncao());
            stmt.setDouble(5, f.getSalario());
            stmt.setObject(6, f.getEndereco().getRua());
            stmt.setObject(7, f.getEndereco().getNumero());
            stmt.setObject(8, f.getEndereco().getBairro());
            stmt.setObject(9, f.getEndereco().getCep());
            stmt.setObject(10, f.getEndereco().getCidade());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + ex);
        } finally {
            Conectar.closeConnection(con, stmt);
        }

    }

    public void update(Funcionario f) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("update funcionario set nome=?, rg=?, cpf=?, funcao=?, salario=?, rua=?, numero=?, bairro=?, cep=? cidade=? where id = ?");
            //stmt.setInt(1, f.getId());
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getRg());
            stmt.setString(3, f.getCpf());
            stmt.setString(4, f.getFuncao());
            stmt.setDouble(5, f.getSalario());
            stmt.setObject(6, f.getEndereco().getRua());
            stmt.setObject(7, f.getEndereco().getNumero());
            stmt.setObject(8, f.getEndereco().getBairro());
            stmt.setObject(9, f.getEndereco().getCep());
            stmt.setObject(10, f.getEndereco().getCidade());

            stmt.setInt(11, f.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        } finally {
            Conectar.closeConnection(con, stmt);
        }

    }

    public void delete(Funcionario f) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("delete from funcionario where id = ?");           
            stmt.setInt(1, f.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + ex);
        } finally {
            Conectar.closeConnection(con, stmt);
        }

    }
}
