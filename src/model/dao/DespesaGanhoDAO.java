/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.DespesaGanho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.swing.JOptionPane;

/**
 *
 * @author Snowgal
 */
public class DespesaGanhoDAO {
    public void inserirGanho(DespesaGanho dp){
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        
        try {
            stmt = con.prepareStatement("insert into despesaganho (tipo, descricao, valor, data) values ('Ganho', ?, ?, ?)");
            stmt.setString(1, dp.getDescricao());
            stmt.setDouble(2, dp.getValor());
            stmt.setString(3, dp.getData());
            stmt.executeUpdate();
            
            
            JOptionPane.showMessageDialog(null, "Inserido com Sucesso!");
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro ao inserir " + e);
        }
    }
}
