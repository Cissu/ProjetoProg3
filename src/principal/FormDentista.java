/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import bancodedados.Conectar;
import classes.DadoInvalidoException;
import classes.Dentista;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Snowgal
 */
public class FormDentista extends javax.swing.JFrame {
    
    Connection conecta;
    PreparedStatement pst;
    ResultSet rs;
    
    public FormDentista() throws DadoInvalidoException {
        initComponents();
        conecta = Conectar.getConnection();
        readDentista();
        setSize(1200, 800);
        setLocationRelativeTo(null);
    }

    public void readDentista() {

        String sql = "Select * from dentista";
        try {
           pst = conecta.prepareStatement(sql);
           rs = pst.executeQuery();
           TabelaDentista.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    
    public void pesquisarDentista() {
        String sql = "Select * from dentista where nome like ?";
        
        try {
            
            pst = conecta.prepareStatement(sql);
            pst.setString(1, txtLimpar.getText()+ "%");
            rs = pst.executeQuery();
            
            TabelaDentista.setModel(DbUtils.resultSetToTableModel(rs));
            
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, erro);
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDentista = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtLimpar = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        lbImg = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Gerenciamento de Dentistas");

        jPanel1.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel1.setLayout(null);

        TabelaDentista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Nome", "CRO", "Especialidade", "Funcao", "RG", "CPF", "Salario", "Rua", "Numero", "Bairro", "Cep", "Cidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TabelaDentista);
        if (TabelaDentista.getColumnModel().getColumnCount() > 0) {
            TabelaDentista.getColumnModel().getColumn(0).setPreferredWidth(25);
            TabelaDentista.getColumnModel().getColumn(1).setMinWidth(200);
            TabelaDentista.getColumnModel().getColumn(1).setPreferredWidth(200);
            TabelaDentista.getColumnModel().getColumn(1).setMaxWidth(200);
            TabelaDentista.getColumnModel().getColumn(2).setPreferredWidth(50);
            TabelaDentista.getColumnModel().getColumn(3).setPreferredWidth(150);
            TabelaDentista.getColumnModel().getColumn(4).setPreferredWidth(50);
            TabelaDentista.getColumnModel().getColumn(5).setPreferredWidth(50);
            TabelaDentista.getColumnModel().getColumn(6).setPreferredWidth(130);
            TabelaDentista.getColumnModel().getColumn(7).setPreferredWidth(100);
            TabelaDentista.getColumnModel().getColumn(8).setPreferredWidth(100);
            TabelaDentista.getColumnModel().getColumn(9).setPreferredWidth(40);
            TabelaDentista.getColumnModel().getColumn(10).setPreferredWidth(70);
            TabelaDentista.getColumnModel().getColumn(11).setPreferredWidth(50);
            TabelaDentista.getColumnModel().getColumn(12).setPreferredWidth(100);
        }

        jPanel1.add(jScrollPane2);
        jScrollPane2.setBounds(10, 150, 1210, 460);

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 153));
        jLabel2.setText("Gerenciar Dentistas");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(550, 80, 142, 22);

        txtLimpar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLimparKeyReleased(evt);
            }
        });
        jPanel1.add(txtLimpar);
        txtLimpar.setBounds(510, 10, 220, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/delete.png"))); // NOI18N
        jButton3.setText("Alterar/Excluir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(700, 110, 140, 30);

        lbImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/DENTISTA.png"))); // NOI18N
        jPanel1.add(lbImg);
        lbImg.setBounds(11, 1, 100, 111);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/tooth.png"))); // NOI18N
        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(540, 110, 140, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/update.png"))); // NOI18N
        jButton4.setText("Atualizar Tabela");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(370, 110, 150, 30);

        btnLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/1464279786_Untitled-4.png"))); // NOI18N
        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar);
        btnLimpar.setBounds(550, 50, 140, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Buscar:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(450, 20, 60, 15);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1180, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        AlterarDentista ad = new AlterarDentista();
        ad.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        CadastroDentista d = new CadastroDentista();
        d.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        readDentista();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtLimparKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLimparKeyReleased
        pesquisarDentista();
    }//GEN-LAST:event_txtLimparKeyReleased

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        txtLimpar.setText("");
        readDentista();
    }//GEN-LAST:event_btnLimparActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDentista;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbImg;
    private javax.swing.JTextField txtLimpar;
    // End of variables declaration//GEN-END:variables
}
