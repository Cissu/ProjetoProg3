/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 *
 * @author Vanessa Macena
 */
public class CadastroFuncionario extends javax.swing.JFrame {

    /**
     * Creates new form CadastroFuncionario
     */
    public CadastroFuncionario() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tfCodFuncionario = new javax.swing.JTextField();
        tfCpfFuncionario = new javax.swing.JTextField();
        tfRgFuncionario = new javax.swing.JTextField();
        tfNomeFuncionario = new javax.swing.JTextField();
        tfFuncaoFuncionario = new javax.swing.JTextField();
        jbOkFuncionario = new javax.swing.JButton();
        btCancelarFuncionario = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        tfSalarioFuncionario = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/icones_funcionarios.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(26, 11, 100, 111);

        jLabel2.setText("Cadastro de funcionário");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(136, 91, 140, 14);

        jLabel3.setText("Codigo");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(20, 140, 40, 30);

        jLabel4.setText("CPF");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(520, 140, 30, 30);

        jLabel5.setText("RG");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(20, 190, 30, 30);

        jLabel6.setText("Nome");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(120, 140, 40, 30);

        jLabel7.setText("Salário");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(550, 190, 50, 30);

        jLabel9.setText("Função");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(250, 190, 50, 30);
        jPanel1.add(tfCodFuncionario);
        tfCodFuncionario.setBounds(60, 140, 40, 30);
        jPanel1.add(tfCpfFuncionario);
        tfCpfFuncionario.setBounds(550, 140, 150, 30);
        jPanel1.add(tfRgFuncionario);
        tfRgFuncionario.setBounds(60, 190, 150, 30);
        jPanel1.add(tfNomeFuncionario);
        tfNomeFuncionario.setBounds(160, 140, 350, 30);
        jPanel1.add(tfFuncaoFuncionario);
        tfFuncaoFuncionario.setBounds(300, 190, 210, 30);

        jbOkFuncionario.setText("Ok");
        jPanel1.add(jbOkFuncionario);
        jbOkFuncionario.setBounds(270, 350, 80, 30);

        btCancelarFuncionario.setText("Cancelar");
        jPanel1.add(btCancelarFuncionario);
        btCancelarFuncionario.setBounds(370, 350, 80, 30);

        jButton1.setText("Endereço");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(20, 260, 90, 30);
        jPanel1.add(tfSalarioFuncionario);
        tfSalarioFuncionario.setBounds(610, 190, 90, 30);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 743, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 393, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        EndereçoFuncionario ef = new EndereçoFuncionario();
        ef.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btCancelarFuncionario;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbOkFuncionario;
    private javax.swing.JTextField tfCodFuncionario;
    private javax.swing.JTextField tfCpfFuncionario;
    private javax.swing.JTextField tfFuncaoFuncionario;
    private javax.swing.JTextField tfNomeFuncionario;
    private javax.swing.JTextField tfRgFuncionario;
    private javax.swing.JTextField tfSalarioFuncionario;
    // End of variables declaration//GEN-END:variables
}
