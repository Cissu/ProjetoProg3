/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import bancodedados.Conectar;
import classes.Agendamento;
import classes.DadoInvalidoException;
import classes.Dentista;
import classes.DespesaGanho;
import classes.Paciente;
import java.awt.Component;
import java.awt.PopupMenu;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.dao.AgendamentoDAO;
import model.dao.DentistaDAO;
import model.dao.DespesaGanhoDAO;
import model.dao.PacienteDAO;

/**
 *
 * @author Ewerton
 */
public class AgendamentoGui extends javax.swing.JFrame {

    AgendamentoDAO aa = new AgendamentoDAO();
    
   

    public AgendamentoGui() throws DadoInvalidoException {
        initComponents();
        readDentista();
        readPaciente();
    }
    
//    public void inserirGanho(DespesaGanho dp){
//        Connection con = Conectar.getConnection();
//        PreparedStatement stmt = null;
//        
//        try {
//            stmt = con.prepareStatement("insert into despesaganho (tipo, descricao, valor) values (Ganho, ?, ?)");
//            stmt.setString(1, dp.getTipo());
//            stmt.setDouble(2, dp.getValor());
//            stmt.executeUpdate();
//            con.close();
//        } catch (Exception e) {
//        }
//    }

    public void readPaciente() throws DadoInvalidoException {
        DefaultTableModel dtm = (DefaultTableModel) TabelaPaciente.getModel();
        dtm.setNumRows(0);
        PacienteDAO pdao = new PacienteDAO();

        for (Paciente p : pdao.read()) {
            dtm.addRow(new Object[]{
                p.getNome(),});
        }
    }

    public void readDentista() throws DadoInvalidoException {

        DefaultTableModel dtm = (DefaultTableModel) TabelaDentista1.getModel();
        dtm.setNumRows(0);
        DentistaDAO ddao = new DentistaDAO();

        for (Dentista d : ddao.read()) {
            dtm.addRow(new Object[]{
                d.getNome(),
                d.getEspecialidade(),});
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
        TabelaPaciente = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtEspecialidade = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jScrollPane3 = new javax.swing.JScrollPane();
        TabelaDentista1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        txtValor = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

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
        jLabel2.setBounds(90, 110, 110, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Dentista:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 170, 70, 20);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Data:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(230, 230, 50, 20);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hora:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(430, 230, 50, 15);
        getContentPane().add(txtNome);
        txtNome.setBounds(250, 60, 360, 30);
        getContentPane().add(txtProcedimento);
        txtProcedimento.setBounds(190, 110, 360, 30);
        getContentPane().add(txtDentista);
        txtDentista.setBounds(120, 160, 290, 30);

        try {
            txtHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##:##:##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        getContentPane().add(txtHora);
        txtHora.setBounds(470, 220, 110, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Agendamento");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(360, -10, 160, 60);

        TabelaPaciente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pacientes"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaPaciente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaPacienteMouseClicked(evt);
            }
        });
        TabelaPaciente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaPacienteKeyReleased(evt);
            }
        });
        jScrollPane2.setViewportView(TabelaPaciente);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(0, 320, 410, 250);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Lista de Dentistas");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(540, 280, 200, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Especialidade:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(420, 170, 100, 15);
        getContentPane().add(txtEspecialidade);
        txtEspecialidade.setBounds(520, 160, 300, 30);

        jButton1.setText("Cadastrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(380, 590, 90, 23);
        getContentPane().add(jDateChooser1);
        jDateChooser1.setBounds(270, 220, 120, 30);

        TabelaDentista1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Dentista", "Especialidade"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TabelaDentista1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TabelaDentista1MouseClicked(evt);
            }
        });
        TabelaDentista1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TabelaDentista1KeyReleased(evt);
            }
        });
        jScrollPane3.setViewportView(TabelaDentista1);
        if (TabelaDentista1.getColumnModel().getColumnCount() > 0) {
            TabelaDentista1.getColumnModel().getColumn(1).setResizable(false);
        }

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(420, 320, 430, 250);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Lista de Pacientes");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(130, 280, 190, 30);
        getContentPane().add(txtValor);
        txtValor.setBounds(620, 110, 70, 30);

        jLabel10.setText("Valor");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(580, 120, 40, 14);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TabelaPacienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaPacienteMouseClicked
        int linha = TabelaPaciente.getSelectedRow();
        txtNome.setText(TabelaPaciente.getValueAt(linha, 0).toString());
    }//GEN-LAST:event_TabelaPacienteMouseClicked

    private void TabelaPacienteKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaPacienteKeyReleased
        int linha = TabelaPaciente.getSelectedRow();
        txtNome.setText(TabelaPaciente.getValueAt(linha, 0).toString());
    }//GEN-LAST:event_TabelaPacienteKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (jDateChooser1.getDate() == null) {
            JOptionPane.showMessageDialog(null, "Campo data em branco");
        } else {
            try {
                DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
                String data = fmt.format(jDateChooser1.getDate());
                Agendamento a = new Agendamento();
                AgendamentoDAO ad = new AgendamentoDAO();
                a.setNome(txtNome.getText());
                a.setProcedimento(txtProcedimento.getText());
                a.setDentista(txtDentista.getText());
                a.setEspecialidade(txtEspecialidade.getText());
                a.setData(data);
                a.setHora(txtHora.getText());

                
                DespesaGanho d = new DespesaGanho();
                DespesaGanhoDAO dpdao = new DespesaGanhoDAO();
                d.setDescricao(txtProcedimento.getText());
                d.setValor(Double.parseDouble(txtValor.getText()));
                d.setData(data);
                
                ad.create(a);
                
                
                dpdao.inserirGanho(d);
            } catch (DadoInvalidoException ex) {
                JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
//           
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void TabelaDentista1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TabelaDentista1MouseClicked
        int linha = TabelaDentista1.getSelectedRow();
        txtDentista.setText(TabelaDentista1.getValueAt(linha, 0).toString());
        txtEspecialidade.setText(TabelaDentista1.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_TabelaDentista1MouseClicked

    private void TabelaDentista1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TabelaDentista1KeyReleased
        int linha = TabelaDentista1.getSelectedRow();
        txtDentista.setText(TabelaDentista1.getValueAt(linha, 0).toString());
        txtEspecialidade.setText(TabelaDentista1.getValueAt(linha, 1).toString());
    }//GEN-LAST:event_TabelaDentista1KeyReleased

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelaDentista1;
    private javax.swing.JTable TabelaPaciente;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField txtDentista;
    private javax.swing.JTextField txtEspecialidade;
    private javax.swing.JFormattedTextField txtHora;
    private javax.swing.JTextField txtNome;
    private javax.swing.JTextField txtProcedimento;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables
}
