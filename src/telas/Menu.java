
package telas;

public class Menu extends javax.swing.JFrame {

    public Menu(String usuario, String senha) {
        initComponents();
        lblSaudacao.setText("Bem-vindo(a), " + usuario + "!");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jButton1 = new javax.swing.JButton();
        btnEntradaMercadoria = new javax.swing.JButton();
        btnConsultaMercadoria = new javax.swing.JButton();
        btnSaidaMercadoria = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        lblSaudacao = new javax.swing.JLabel();
        btnCadastroProdutos = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        mnuSobre = new javax.swing.JMenu();
        mnuAjuda = new javax.swing.JMenu();
        mnuSair = new javax.swing.JMenu();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        getContentPane().setLayout(null);

        jButton1.setText("jButton1");
        getContentPane().add(jButton1);
        jButton1.setBounds(0, 0, 0, 0);

        btnEntradaMercadoria.setText("Entrada de mercadoria");
        btnEntradaMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradaMercadoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEntradaMercadoria);
        btnEntradaMercadoria.setBounds(200, 150, 160, 40);

        btnConsultaMercadoria.setText("Consulta de mercadoria");
        btnConsultaMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaMercadoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnConsultaMercadoria);
        btnConsultaMercadoria.setBounds(200, 250, 160, 40);

        btnSaidaMercadoria.setText("Saída de mercadoria");
        btnSaidaMercadoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaidaMercadoriaActionPerformed(evt);
            }
        });
        getContentPane().add(btnSaidaMercadoria);
        btnSaidaMercadoria.setBounds(200, 200, 160, 40);

        jLabel2.setText("O que deseja fazer?");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(420, 50, 110, 16);
        getContentPane().add(lblSaudacao);
        lblSaudacao.setBounds(410, 30, 160, 16);

        btnCadastroProdutos.setText("Cadastro de produtos");
        btnCadastroProdutos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastroProdutosActionPerformed(evt);
            }
        });
        getContentPane().add(btnCadastroProdutos);
        btnCadastroProdutos.setBounds(200, 100, 160, 40);

        mnuSobre.setText("Sobre");
        jMenuBar1.add(mnuSobre);

        mnuAjuda.setText("Ajuda");
        jMenuBar1.add(mnuAjuda);

        mnuSair.setText("Sair");
        jMenuBar1.add(mnuSair);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(614, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntradaMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradaMercadoriaActionPerformed
        new EntradaMercadoria().setVisible(true);
    }//GEN-LAST:event_btnEntradaMercadoriaActionPerformed

    private void btnConsultaMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaMercadoriaActionPerformed
        new ConsultaEstoque().setVisible(true);
    }//GEN-LAST:event_btnConsultaMercadoriaActionPerformed

    private void btnSaidaMercadoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaidaMercadoriaActionPerformed
        new SaidaMercadoria().setVisible(true);
    }//GEN-LAST:event_btnSaidaMercadoriaActionPerformed

    private void btnCadastroProdutosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastroProdutosActionPerformed
        new CadastroProdutos().setVisible(true);
    }//GEN-LAST:event_btnCadastroProdutosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastroProdutos;
    private javax.swing.JButton btnConsultaMercadoria;
    private javax.swing.JButton btnEntradaMercadoria;
    private javax.swing.JButton btnSaidaMercadoria;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblSaudacao;
    private javax.swing.JMenu mnuAjuda;
    private javax.swing.JMenu mnuSair;
    private javax.swing.JMenu mnuSobre;
    // End of variables declaration//GEN-END:variables
}
