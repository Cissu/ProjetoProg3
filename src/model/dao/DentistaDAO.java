/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.DadoInvalidoException;
import classes.Dentista;
import classes.Endereco;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
    
    public List<Dentista> read() throws DadoInvalidoException {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Dentista> dentistas = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from dentista");
            rs = stmt.executeQuery();

            while (rs.next()) {

                Dentista dent = new Dentista();
                //Endereco e = new Endereco();
                dent.setId(rs.getInt("id"));
                dent.setNome(rs.getString("nome"));
                dent.setCro(rs.getString("cro"));
                dent.setEspecialidade(rs.getString("especialidade"));
                dent.setFuncao(rs.getString("funcao"));
                dent.setRg(rs.getString("rg"));
                dent.setCpf(rs.getString("cpf"));
                dent.setSalario(rs.getDouble("salario"));
                dent.setEndereco( new Endereco() );
                dent.getEndereco().setRua(rs.getString("Rua"));
                dent.getEndereco().setNumero(rs.getString("numero"));
                dent.getEndereco().setBairro(rs.getString("bairro"));
                dent.getEndereco().setCep(rs.getString("cep"));
                dent.getEndereco().setCidade(rs.getString("cidade"));
                dentistas.add(dent);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {
            Conectar.closeConnection(con, stmt, rs);

        }
        return dentistas;

    }
    
    
}
