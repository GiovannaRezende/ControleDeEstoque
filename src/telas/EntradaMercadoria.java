package telas;

public class EntradaMercadoria extends javax.swing.JFrame {

    public EntradaMercadoria() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTituloEntrada = new javax.swing.JLabel();
        lblNroEntrada = new javax.swing.JLabel();
        txtNroEntrada = new javax.swing.JTextField();
        lblProduto = new javax.swing.JLabel();
        lblQuantidade = new javax.swing.JLabel();
        lblValor = new javax.swing.JLabel();
        txtQuantidade = new javax.swing.JTextField();
        txtValor = new javax.swing.JTextField();
        btnSalvarEntrada = new javax.swing.JButton();
        cmbProduto = new javax.swing.JComboBox<>();

        getContentPane().setLayout(null);

        txtTituloEntrada.setText("ENTRADA DE MERCADORIA");
        getContentPane().add(txtTituloEntrada);
        txtTituloEntrada.setBounds(20, 20, 180, 16);

        lblNroEntrada.setText("Nro. entrada ");
        getContentPane().add(lblNroEntrada);
        lblNroEntrada.setBounds(130, 110, 80, 16);
        getContentPane().add(txtNroEntrada);
        txtNroEntrada.setBounds(200, 100, 230, 30);

        lblProduto.setText("Produto");
        getContentPane().add(lblProduto);
        lblProduto.setBounds(150, 150, 43, 16);

        lblQuantidade.setText("Quantidade");
        getContentPane().add(lblQuantidade);
        lblQuantidade.setBounds(130, 190, 70, 16);

        lblValor.setText("Valor");
        getContentPane().add(lblValor);
        lblValor.setBounds(160, 230, 40, 16);
        getContentPane().add(txtQuantidade);
        txtQuantidade.setBounds(200, 180, 230, 30);
        getContentPane().add(txtValor);
        txtValor.setBounds(200, 220, 230, 30);

        btnSalvarEntrada.setText("Salvar");
        btnSalvarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarEntradaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarEntrada);
        btnSalvarEntrada.setBounds(360, 270, 72, 30);

        getContentPane().add(cmbProduto);
        cmbProduto.setBounds(200, 140, 230, 30);

        setSize(new java.awt.Dimension(614, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSalvarEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarEntrada;
    private javax.swing.JComboBox<String> cmbProduto;
    private javax.swing.JLabel lblNroEntrada;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblQuantidade;
    private javax.swing.JLabel lblValor;
    private javax.swing.JTextField txtNroEntrada;
    private javax.swing.JTextField txtQuantidade;
    private javax.swing.JLabel txtTituloEntrada;
    private javax.swing.JTextField txtValor;
    // End of variables declaration//GEN-END:variables

}
