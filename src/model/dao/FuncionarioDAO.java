/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao;

import bancodedados.Conectar;
import classes.DadoInvalidoException;
import classes.Endereco;
import classes.Funcionario;
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
            stmt.setObject(7 ,f.getEndereco().getNumero());
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
            stmt = con.prepareStatement("update funcionario set nome=?, rg=?, funcao=?, salario=?, rua=?, numero=?, bairro=?, cep=?, cidade=? where cpf = ?");
            //stmt.setInt(1, f.getId());
            stmt.setString(1, f.getNome());
            stmt.setString(2, f.getRg());
            //stmt.setString(3, f.getCpf());
            stmt.setString(3, f.getFuncao());
            stmt.setDouble(4, f.getSalario());
            stmt.setObject(5, f.getEndereco().getRua());
            stmt.setObject(6, f.getEndereco().getNumero());
            stmt.setObject(7, f.getEndereco().getBairro());
            stmt.setObject(8, f.getEndereco().getCep());
            stmt.setObject(9, f.getEndereco().getCidade());

            stmt.setString(10, f.getCpf());

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
            stmt = con.prepareStatement("delete from funcionario where cpf = ?");           
            stmt.setString(1, f.getCpf());

            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Excluido com sucesso!");

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao excluir " + ex);
        } finally {
            Conectar.closeConnection(con, stmt);
        }

    }
    
    public List<Funcionario> read() throws DadoInvalidoException {
        Connection con = Conectar.getConnection();
        PreparedStatement stmt = null;
        ResultSet rs = null;

        List<Funcionario> funcionarios = new ArrayList<>();

        try {
            stmt = con.prepareStatement("select * from funcionario");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Funcionario func = new Funcionario();
                func.setId(rs.getInt("id"));
                func.setNome(rs.getString("nome"));
                func.setRg(rs.getString("rg"));
                func.setCpf(rs.getString("cpf"));
                func.setFuncao(rs.getString("Funcao"));
                func.setSalario(rs.getDouble("salario"));
                func.setEndereco(new Endereco());
                func.getEndereco().setRua(rs.getString("rua"));
                func.getEndereco().setNumero(rs.getString("numero"));
                func.getEndereco().setBairro(rs.getString("bairro"));
                func.getEndereco().setCep(rs.getString("cep"));
                func.getEndereco().setCidade(rs.getString("cidade"));
                funcionarios.add(func);

            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao listar " + ex);
        } finally {
            Conectar.closeConnection(con, stmt, rs);

        }
        return funcionarios;

    }
}
