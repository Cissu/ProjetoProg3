/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.DadoInvalidoException;
import classes.Endereco;
import classes.Paciente;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.dao.PacienteDAO;

public class AlterarPaciente extends javax.swing.JFrame {

    public AlterarPaciente() {
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    Paciente p = new Paciente();
    PacienteDAO ddao = new PacienteDAO();

    public void alterar() throws DadoInvalidoException {
        int g = 0;
        if (txtCpf1.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um cpf válido");
        } else {
            txtNome.enable();
            txtRg.enable();
            txtData.enable();
//            txtSalario.enable();
            txtData.enable();
            txtRua.enable();
            txtBairro.enable();
            txtCep.enable();
            txtCidade.enable();
            txtNumero.enable();

            for (Paciente p : ddao.read()) {

                if (p.getCpf().equals(txtCpf1.getText())) {

//                    double a = p.getSalario();
//                    String b;
//                    b = String.valueOf(a);
                    txtNome.setText(p.getNome());
                    txtRg.setText(p.getRg());
                    txtData.setText(p.getDataNasc());
//                    txtSalario.setText(b);
                    txtRua.setText(p.getEndereco().getRua());
                    txtNumero.setText(p.getEndereco().getNumero());
                    txtBairro.setText(p.getEndereco().getBairro());
                    txtCep.setText(p.getEndereco().getCep());
                    txtCidade.setText(p.getEndereco().getCidade());
                    g = 1;
                    break;
                }
            }
            if (g != 1) {
                JOptionPane.showMessageDialog(null, "Registro não encontrado");
                txtNome.enable();
                txtRg.enable(false);
//                txtSalario.enable(false);
                txtData.enable(false);
                txtRua.enable(false);
                txtBairro.enable(false);
                txtCep.enable(false);
                txtCidade.enable(false);
                txtNumero.enable(false);
            }

        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        txtCpf1 = new javax.swing.JFormattedTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        txtRua = new javax.swing.JTextField();
        txtNumero = new javax.swing.JTextField();
        txtBairro = new javax.swing.JTextField();
        txtCep = new javax.swing.JTextField();
        txtData = new javax.swing.JFormattedTextField();
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar/Excluir Pacientes");
        setResizable(false);
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Alterar/Excluir Cadastros de Pacientes");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(130, 40, 520, 33);

        txtNome.setEnabled(false);
        getContentPane().add(txtNome);
        txtNome.setBounds(90, 160, 460, 34);

        txtRg.setEnabled(false);
        getContentPane().add(txtRg);
        txtRg.setBounds(90, 200, 460, 34);

        txtCidade.setEnabled(false);
        getContentPane().add(txtCidade);
        txtCidade.setBounds(230, 430, 322, 34);

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/menor.png"))); // NOI18N
        btnBuscar.setText("BUSCAR");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar);
        btnBuscar.setBounds(580, 120, 110, 30);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("CPF:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(20, 130, 70, 15);

        try {
            txtCpf1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtCpf1);
        txtCpf1.setBounds(90, 120, 460, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 170, 70, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Data de Nascimento:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 250, 130, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Numero:");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(440, 360, 70, 15);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Bairro:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(20, 400, 70, 15);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("CEP:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(20, 440, 70, 15);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Cidade:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(170, 440, 70, 15);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Rua:");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(20, 360, 70, 15);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("RG:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(20, 210, 70, 15);

        txtRua.setEnabled(false);
        getContentPane().add(txtRua);
        txtRua.setBounds(90, 350, 340, 34);

        txtNumero.setEnabled(false);
        getContentPane().add(txtNumero);
        txtNumero.setBounds(500, 350, 50, 34);

        txtBairro.setEnabled(false);
        getContentPane().add(txtBairro);
        txtBairro.setBounds(90, 390, 340, 34);

        txtCep.setEnabled(false);
        getContentPane().add(txtCep);
        txtCep.setBounds(90, 430, 60, 34);

        try {
            txtData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtData.setText("      /   /    ");
        txtData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDataActionPerformed(evt);
            }
        });
        getContentPane().add(txtData);
        txtData.setBounds(160, 240, 110, 30);

        btnExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        btnExcluir.setText("EXCLUIR");
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });
        getContentPane().add(btnExcluir);
        btnExcluir.setBounds(580, 220, 110, 30);

        btnAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/update.png"))); // NOI18N
        btnAlterar.setText("ALTERAR");
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAlterar);
        btnAlterar.setBounds(580, 180, 110, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 500, 100, 30);

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Untitled-1.png"))); // NOI18N
        jLabel3.setText("jLabel2");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            alterar();
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(AlterarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        if (txtCpf1.getText().isEmpty() || txtCpf1.getText() == null) {
            JOptionPane.showMessageDialog(null, "Digite um Cpf válido", "Aviso", JOptionPane.WARNING_MESSAGE);
        } else {
            try {
                p.setCpf(txtCpf1.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            try {
                int op = JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o registro " + txtCpf1.getText() + "?", "Aviso", JOptionPane.WARNING_MESSAGE);
                if (op == 0) {
                    ddao.delete(p);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if (txtNome.getText().isEmpty() || txtNome.getText() == null
                || txtRg.getText().isEmpty() || txtRg.getText() == null
                || txtData.getText().isEmpty() || txtData.getText() == null
                //            || txtSalario.getText().isEmpty() || txtSalario.getText() == null
                || txtRua.getText().isEmpty() || txtRua.getText() == null
                || txtNumero.getText().isEmpty() || txtNumero.getText() == null
                || txtBairro.getText().isEmpty() || txtBairro.getText() == null
                || txtCep.getText().isEmpty() || txtCep.getText() == null
                || txtCidade.getText().isEmpty() || txtCidade.getText() == null) {

            JOptionPane.showMessageDialog(null, "Algum campo está vazio");
        } else {
            try {
                p.setNome(txtNome.getText());
                p.setRg(txtRg.getText());
                p.setDataNasc(txtData.getText());
//                p.setSalario(Double.parseDouble(txtSalario.getText()));
                p.setEndereco(new Endereco());
                p.getEndereco().setRua(txtRua.getText());;
                p.getEndereco().setNumero(txtNumero.getText());
                p.getEndereco().setBairro(txtBairro.getText());
                p.getEndereco().setCep(txtCep.getText());
                p.getEndereco().setCidade(txtCidade.getText());

                p.setCpf(txtCpf1.getText());
            } catch (DadoInvalidoException ex) {
                JOptionPane.showConfirmDialog(null, ex.getMessage());
            }
        }
        try {
            ddao.update(p);
            txtNome.setText("");
            txtRg.setText("");
            txtCpf1.setText("");
            txtData.setText("");
//            txtSalario.setText("");
            txtRua.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            txtCep.setText("");
            txtCidade.setText("");
            txtNome.enable(false);
            txtRg.enable(false);
            txtData.enable(false);
//            txtSalario.enable(false);
            txtRua.enable(false);
            txtBairro.enable(false);
            txtCep.enable(false);
            txtCidade.enable(false);
            txtNumero.enable(false);
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDataActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDataActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JFormattedTextField txtCpf1;
    private javax.swing.JFormattedTextField txtData;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    // End of variables declaration//GEN-END:variables
}
