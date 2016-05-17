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
    
    public void create (Funcionario f){
    Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("insert into funcionario (id, nome, rg, cpf, funcao) values (?,?,?,?,?)");
            stmt.setInt(1, f.getId());
            stmt.setString(2, f.getNome());
            stmt.setString(3, f.getRg());
            stmt.setString(4, f.getCpf());
            stmt.setString(5, f.getFuncao());
            //stmt.setDouble(6, f.getSalario());
            //stmt.setObject(7, f.getEndereco());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Inserido com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao salvar " + ex);
        }finally{
            Conectar.closeConnection(con, stmt);
        }
     
    }
    
    
        public void update (Funcionario f){
    Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
       
        try {
            stmt = con.prepareStatement("update funcionario set nome=?, rg=?, cpf=?, funcao=? where id = ?");
            //stmt.setInt(1, f.getId());
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getRg());
            stmt.setString(3, f.getCpf());
            stmt.setString(4, f.getFuncao());
            //stmt.setDouble(6, f.getSalario());
            //stmt.setObject(7, f.getEndereco());
            stmt.setInt(5, f.getId());
            
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Atualizado com sucesso!");
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao Atualizar " + ex);
        }finally{
            Conectar.closeConnection(con, stmt);
        }
     
    }
}
