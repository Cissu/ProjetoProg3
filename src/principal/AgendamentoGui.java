/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;


import classes.DadoInvalidoException;
import classes.Dentista;
import java.awt.Component;
import java.awt.PopupMenu;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import model.dao.AgendamentoDAO;
import model.dao.DentistaDAO;


/**
 *
 * @author Ewerton
 */
public class AgendamentoGui extends javax.swing.JFrame {

   AgendamentoDAO aa = new AgendamentoDAO();
   
    
    public AgendamentoGui() throws DadoInvalidoException {
        initComponents();
        readDentista();
    }

    public void readDentista() throws DadoInvalidoException {

        DefaultTableModel dtm = (DefaultTableModel) TabelaDentista.getModel();
        dtm.setNumRows(0);
        DentistaDAO ddao = new DentistaDAO();
        
        for (Dentista d : ddao.read()) {
            dtm.addRow(new Object[]{
                d.getNome(),
                d.getEspecialidade(),
            });
        }

    }
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtNome = new javax.swing.JTextField();
        txtProcedimento = new javax.swing.JTextField();
        txtDentista = new javax.swing.JTextField();
        txtHora = new javax.swing.JFormattedTextField();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TabelaDentista = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEspecialidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agendamentos");
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Nome:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(200, 60, 60, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Procedimento:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(150, 110, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Dentista:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 170, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Data:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 220, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(400, 230, 50, 15);
        getContentPane().add(txtNome);
        txtNome.setBounds(250, 60, 360, 30);
        getContentPane().add(txtProcedimento);
        txtProcedimento.setBounds(250, 110, 360, 30);
        getContentPane().add(txtDentista);
        txtDentista.setBounds(130, 170, 360, 30);

        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtHora);
        txtHora.setBounds(450, 220, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Agendamento");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, -10, 160, 60);

        TabelaDentista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDentista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDentistaMouseClicked(evt);
            }
        });
        TabelaDentista.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaDentistaKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaDentista);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 320, 850, 250);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Dentistas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(380, 280, 100, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Especialidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(520, 180, 100, 15);
        getContentPane().add(txtEspecialidade);
        txtEspecialidade.setBounds(610, 170, 230, 30);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 590, 90, 23);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(207, 220, 120, 30);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaDentistaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDentistaMouseClicked
        int linha = TabelaDentista.getSelectedRow();
        txtDentista.setText(TabelaDentista.getValueAt(linha, 0).toString());
        txtEspecialidade.setText(TabelaDentista.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_TabelaDentistaMouseClicked

    private void TabelaDentistaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaDentistaKeyReleased
        int linha = TabelaDentista.getSelectedRow();
        txtDentista.setText(TabelaDentista.getValueAt(linha, 0).toString());
        txtEspecialidade.setText(TabelaDentista.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_TabelaDentistaKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDentista;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField txtDentista;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProcedimento;
    // End of variables declaration//GEN-END:variables
}
