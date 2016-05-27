/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.DadoInvalidoException;
import classes.Endereco;
import classes.Paciente;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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
             JOptionPane.showMessageDialog(null, "Erro ao salvar, CPF já exitente! " + e); //Se for outro erro fora o duplicate entry, adc o + e
        } finally {
            Conectar.closeConnection(con, stmt);
        }
    }

    public void update(Paciente p) {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;

        try {
            stmt = con.prepareStatement("update paciente set nome=?, rg=?, dataNasc=?, rua=?, numero=?, bairro=?, cep=?, cidade=? where cpf=?");
            //stmt.setInt(1, p.getId());
            stmt.setString(1, p.getNome());
            stmt.setString(2, p.getRg());
//            stmt.setString(3, p.getCpf());
            stmt.setString(3, p.getDataNasc());
            stmt.setObject(4, p.getEndereco().getRua());
            stmt.setObject(5, p.getEndereco().getNumero());
            stmt.setObject(6, p.getEndereco().getBairro());
            stmt.setObject(7, p.getEndereco().getCep());
            stmt.setObject(8, p.getEndereco().getCidade());
            stmt.setString(9, p.getCpf());

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
            stmt = con.prepareStatement("delete from paciente where cpf = ?");
            stmt.setString(1, p.getCpf());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + e);
        } finally {
            Conectar.closeConnection(con, stmt);
        }
    }

    public List<Paciente> read() throws DadoInvalidoException {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Paciente> pacientes = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from paciente");
            rs = stmt.executeQuery();
            while (rs.next()) {
                Paciente paciente = new Paciente();
                paciente.setId(rs.getInt("id"));
                paciente.setNome(rs.getString("nome"));
                paciente.setRg(rs.getString("rg"));
                paciente.setCpf(rs.getString("cpf"));
                paciente.setDataNasc(rs.getString("dataNasc"));
                paciente.setEndereco( new Endereco() );
                paciente.getEndereco().setRua(rs.getString("rua"));
                paciente.getEndereco().setNumero(rs.getString("numero"));
                paciente.getEndereco().setBairro(rs.getString("bairro"));
                paciente.getEndereco().setCep(rs.getString("cep"));
                paciente.getEndereco().setCidade(rs.getString("cidade"));
                pacientes.add(paciente);
            }
        } catch (SQLException ex) {
            Logger.getLogger(PacienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            Conectar.closeConnection(con, stmt, rs);
        }
        return pacientes;
    }
}
