/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import classes.DadoInvalidoException;
import classes.Endereco;
import classes.Funcionario;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import model.dao.FuncionarioDAO;

/**
 *
 * @author Snowgal
 */
public class AlterarFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form AlterarFuncionario
     */
    public AlterarFuncionario() {
        initComponents();
        setSize(800, 600);
        setLocationRelativeTo(null);
    }
    Funcionario f = new Funcionario();
    FuncionarioDAO ddao = new FuncionarioDAO();

    public void alterar() throws DadoInvalidoException {
        int g = 0;
        if (txtCpf.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Digite um cpf v�lido");
        } else {
            txtNome.enable();
            txtRg.enable();
            txtfuncao.enable();
            txtSalario.enable();
            //txtData.enable();
            txtRua.enable();
            txtBairro.enable();
            txtCep.enable();
            txtCidade.enable();
            txtNumero.enable();

            
            for (Funcionario f : ddao.read()) {

                if (f.getCpf().equals(txtCpf.getText())) {

                    double a = f.getSalario();
                    String b;
                    b = String.valueOf(a);

                    txtNome.setText(f.getNome());
                    txtRg.setText(f.getRg());
                    txtfuncao.setText(f.getFuncao());
                    txtSalario.setText(b);
                    txtRua.setText(f.getEndereco().getRua());
                    txtNumero.setText(f.getEndereco().getNumero());
                    txtBairro.setText(f.getEndereco().getBairro());
                    txtCep.setText(f.getEndereco().getCep());
                    txtCidade.setText(f.getEndereco().getCidade());
                    g = 1;
                    break;
                }
            }
            if (g != 1) {
                JOptionPane.showMessageDialog(null, "Registro n�o encontrado");
                txtNome.enable();
                txtRg.enable(false);
                txtSalario.enable(false);
                //txtData.enable(false);
                txtRua.enable(false);
                txtBairro.enable(false);
                txtCep.enable(false);
                txtCidade.enable(false);
                txtNumero.enable(false);
            }

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtCpf = new javax.swing.JTextField();
        txtNome = new javax.swing.JTextField();
        txtRg = new javax.swing.JTextField();
        txtCidade = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
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
        btnExcluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        txtfuncao = new javax.swing.JTextField();
        txtSalario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alterar/Excluir Funcion�rios");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Alterar/Excluir Cadastros de Funcion�rios");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(130, 40, 520, 33);
        getContentPane().add(txtCpf);
        txtCpf.setBounds(90, 120, 460, 34);

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

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Nome:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(20, 170, 70, 15);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Funcao:");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(20, 250, 110, 15);

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

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Sal�rio:");
        getContentPane().add(jLabel18);
        jLabel18.setBounds(20, 290, 110, 20);

        txtfuncao.setEnabled(false);
        txtfuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfuncaoActionPerformed(evt);
            }
        });
        getContentPane().add(txtfuncao);
        txtfuncao.setBounds(90, 240, 460, 34);

        txtSalario.setEnabled(false);
        txtSalario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSalarioActionPerformed(evt);
            }
        });
        getContentPane().add(txtSalario);
        txtSalario.setBounds(90, 280, 460, 34);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/back.png"))); // NOI18N
        jButton1.setText("Voltar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(650, 500, 100, 30);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Untitled-1.png"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 810, 600);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        //Funcionario p = new Funcionario();
        //FuncionarioDAO fundao = new FuncionarioDAO();
        
        if(txtCpf.getText().isEmpty() || txtCpf.getText()==null){
            JOptionPane.showMessageDialog(null, "Digite um Cpf v�lido", "Aviso", JOptionPane.WARNING_MESSAGE);
        }else{
            try {
                f.setCpf(txtCpf.getText());
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
            try {
                int op =JOptionPane.showConfirmDialog(null, "Deseja Realmente excluir o registro " + txtCpf.getText() + "?" , "Aviso", JOptionPane.WARNING_MESSAGE);
                if (op ==0)
                    ddao.delete(f);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e.getMessage());
            }
        }
              
    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed

        if (txtNome.getText().isEmpty() || txtNome.getText() == null
                || txtRg.getText().isEmpty() || txtRg.getText() == null
                || txtfuncao.getText().isEmpty() || txtfuncao.getText() == null
                || txtSalario.getText().isEmpty() || txtSalario.getText() == null
                || txtRua.getText().isEmpty() || txtRua.getText() == null
                || txtNumero.getText().isEmpty() || txtNumero.getText() == null
                || txtBairro.getText().isEmpty() || txtBairro.getText() == null
                || txtCep.getText().isEmpty() || txtCep.getText() == null
                || txtCidade.getText().isEmpty() || txtCidade.getText() == null) {

            JOptionPane.showMessageDialog(null, "Algum campo est� vazio");
        } else {
            try {
                f.setNome(txtNome.getText());
                f.setRg(txtRg.getText());
                f.setFuncao(txtfuncao.getText());
                f.setSalario(Double.parseDouble(txtSalario.getText()));
                f.setEndereco(new Endereco());
                f.getEndereco().setRua(txtRua.getText());;
                f.getEndereco().setNumero(txtNumero.getText());
                f.getEndereco().setBairro(txtBairro.getText());
                f.getEndereco().setCep(txtCep.getText());
                f.getEndereco().setCidade(txtCidade.getText());
                
                f.setCpf(txtCpf.getText());
            } catch (DadoInvalidoException ex) {
                JOptionPane.showConfirmDialog(null, ex.getMessage());
            }
        }
        try {
            ddao.update(f);
            txtNome.setText("");
            txtRg.setText("");
            txtCpf.setText("");
            txtfuncao.setText("");
            txtSalario.setText("");
            txtRua.setText("");
            txtNumero.setText("");
            txtBairro.setText("");
            txtCep.setText("");
            txtCidade.setText("");
            txtNome.enable(false);
            txtRg.enable(false);
            txtfuncao.enable(false);
            txtSalario.enable(false);
            txtRua.enable(false);
            txtBairro.enable(false);
            txtCep.enable(false);
            txtCidade.enable(false);
            txtNumero.enable(false);
        } catch (Exception ex) {
            JOptionPane.showConfirmDialog(null, ex.getMessage());
        }
    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        try {
            alterar();
        } catch (DadoInvalidoException ex) {
            Logger.getLogger(AlterarFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtfuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfuncaoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfuncaoActionPerformed

    private void txtSalarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSalarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSalarioActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtBairro;
    private javax.swing.JTextField txtCep;
    private javax.swing.JTextField txtCidade;
    private javax.swing.JTextField txtCpf;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextField txtRg;
    private javax.swing.JTextField txtRua;
    private javax.swing.JTextField txtSalario;
    private javax.swing.JTextField txtfuncao;
    // End of variables declaration//GEN-END:variables
}
