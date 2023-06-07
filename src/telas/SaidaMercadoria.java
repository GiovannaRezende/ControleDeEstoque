package telas;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class SaidaMercadoria extends javax.swing.JFrame {

    public SaidaMercadoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtQuantiaSaida = new javax.swing.JTextField();
        txtNroSaida = new javax.swing.JTextField();
        cmbProduto = new javax.swing.JComboBox<>();
        lblNroSaida = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        lblQuantiaSaida = new javax.swing.JLabel();
        lblTituloSaida = new javax.swing.JLabel();
        btnSalvarSaida = new javax.swing.JButton();

        getContentPane().setLayout(null);
        getContentPane().add(txtQuantiaSaida);
        txtQuantiaSaida.setBounds(230, 190, 180, 30);
        getContentPane().add(txtNroSaida);
        txtNroSaida.setBounds(230, 110, 180, 30);

        cmbProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbProduto);
        cmbProduto.setBounds(230, 150, 180, 30);

        lblNroSaida.setText("Nro. Saída");
        getContentPane().add(lblNroSaida);
        lblNroSaida.setBounds(160, 120, 80, 16);

        lblProduto.setText("Produto");
        getContentPane().add(lblProduto);
        lblProduto.setBounds(170, 160, 60, 16);

        lblQuantiaSaida.setText("Quantidade");
        getContentPane().add(lblQuantiaSaida);
        lblQuantiaSaida.setBounds(150, 200, 70, 16);

        lblTituloSaida.setText("SAÍDA DE MERCADORIA");
        getContentPane().add(lblTituloSaida);
        lblTituloSaida.setBounds(20, 20, 240, 16);

        btnSalvarSaida.setText("Salvar");
        btnSalvarSaida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarSaidaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarSaida);
        btnSalvarSaida.setBounds(340, 260, 72, 30);

        setSize(new java.awt.Dimension(614, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cmbProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbProdutoActionPerformed

    }//GEN-LAST:event_cmbProdutoActionPerformed

    private void btnSalvarSaidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarSaidaActionPerformed
      
    }//GEN-LAST:event_btnSalvarSaidaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarSaida;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel lblNroSaida;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantiaSaida;
    private javax.swing.JLabel lblTituloSaida;
    private javax.swing.JTextField txtNroSaida;
    private javax.swing.JTextField txtQuantiaSaida;
    // End of variables declaration//GEN-END:variables
}
