/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.DadoInvalidoException;
import classes.Dentista;
import com.sun.javafx.scene.control.skin.VirtualFlow;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;

/**
 *
 * @author Snowgal
 */
public class AgendamentoDAO {
    
    public void buscarTodos(JComboBox cmbBox) {
        
        ResultSet rs = null;
        PreparedStatement stmt = null;
        
        //String sql = "select nome from dentista";
        
        Connection con = Conectar.getConnection();
        
        try {
            stmt = con.prepareStatement("select nome from dentista");        
            //con.close();
            rs = stmt.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        cmbBox.removeAllItems();
        cmbBox.addItem("nome");
        DefaultComboBoxModel comboBox = (DefaultComboBoxModel) cmbBox.getModel();
        try {
            while(rs.next()){
                String nome = rs.getString("nome");
                cmbBox.addItem(nome);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            Conectar.closeConnection(con, stmt, rs);
        }
    }
    
    private Dentista BuscarObjeto(ResultSet rs) throws SQLException{
        Dentista dentista = new Dentista();
        try {
            dentista.setNome(rs.getString("nome"));
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(AgendamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }return dentista;
    }
    
}
