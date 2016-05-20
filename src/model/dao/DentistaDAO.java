/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.Dentista;
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
public class DentistaDAO {
   
    public void create(Dentista d) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("insert into dentista (nome, cro, especialidade, funcao, rg, cpf, salario, rua, numero, bairro, cep, cidade) values (?,?,?,?,?,?,?,?,?,?,?,?)");
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getCro());
            stmt.setString(3, d.getEspecialidade());
            stmt.setString(4, d.getFuncao());
            stmt.setString(5, d.getRg());
            stmt.setString(6, d.getCpf());
            stmt.setDouble(7, d.getSalario());
            stmt.setObject(8, d.getEndereco().getRua());
            stmt.setObject(9, d.getEndereco().getNumero());
            stmt.setObject(10, d.getEndereco().getBairro());
            stmt.setObject(11, d.getEndereco().getCep());
            stmt.setObject(12, d.getEndereco().getCidade());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir " + e);
        }
    }

    public void update(Dentista d) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("update paciente set nome=?, cro=?, especialidade=?, funcao=?, rg=?, cpf=?, salario=?, rua=?, numero=?, bairro=?, cep=? cidade=? where id = ?");
            stmt.setString(1, d.getNome());
            stmt.setString(2, d.getCro());
            stmt.setString(3, d.getEspecialidade());
            stmt.setString(4, d.getFuncao());
            stmt.setString(5, d.getRg());
            stmt.setString(6, d.getCpf());
            stmt.setDouble(7, d.getSalario());
            stmt.setObject(8, d.getEndereco().getRua());
            stmt.setObject(9, d.getEndereco().getNumero());
            stmt.setObject(10, d.getEndereco().getBairro());
            stmt.setObject(11, d.getEndereco().getCep());
            stmt.setObject(12, d.getEndereco().getCidade());
            stmt.setInt(13, d.getId());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao atualizar " + e);
        }

    }
    
    public void delete(Dentista d){
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("delete from dentista where id=?");
            stmt.setInt(1, d.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + ex);
        }
    }
}
