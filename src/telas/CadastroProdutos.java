package telas;

import dados.Produtos;
import dados.SistemaDao;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastroProdutos extends javax.swing.JFrame {

    public CadastroProdutos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloProdutos = new javax.swing.JLabel();
        lblProduto = new javax.swing.JLabel();
        txtProduto = new javax.swing.JTextField();
        btnSalvarProduto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtMarca = new javax.swing.JTextField();
        lblMedida = new javax.swing.JLabel();
        txtMedida = new javax.swing.JTextField();

        getContentPane().setLayout(null);

        lblTituloProdutos.setText("CADASTRO DE PRODUTOS");
        getContentPane().add(lblTituloProdutos);
        lblTituloProdutos.setBounds(20, 20, 170, 20);

        lblProduto.setText("Produto");
        getContentPane().add(lblProduto);
        lblProduto.setBounds(170, 130, 60, 16);

        txtProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(txtProduto);
        txtProduto.setBounds(220, 120, 180, 30);

        btnSalvarProduto.setText("Salvar");
        btnSalvarProduto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarProdutoActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalvarProduto);
        btnSalvarProduto.setBounds(330, 270, 75, 30);

        jLabel1.setText("Marca");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(180, 180, 37, 16);
        getContentPane().add(txtMarca);
        txtMarca.setBounds(220, 170, 180, 30);

        lblMedida.setText("Medida");
        getContentPane().add(lblMedida);
        lblMedida.setBounds(170, 230, 50, 16);
        getContentPane().add(txtMedida);
        txtMedida.setBounds(220, 220, 180, 30);

        setSize(new java.awt.Dimension(614, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtProdutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProdutoActionPerformed

    private void btnSalvarProdutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarProdutoActionPerformed
        
        if(txtProduto.getText().equals("")) {
        JOptionPane.showMessageDialog(null, "O nome do produto é obrigatório!");
        txtProduto.requestFocus();
        return;
        }
        
        Produtos produto = new Produtos();
        produto.setCodigo(txtProduto.getText());
        produto.setNome(txtMarca.getText());
        produto.setCidade(txtMedida.getText());
        
        try {
               
            SistemaDao.salvarProduto(produto);
            
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso!");
            limparTela();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.getMessage());
            
        } catch (SQLException ex) {
            if(ex.getMessage().contains("Duplicate entry")){
               JOptionPane.showMessageDialog(null,"O departamento de código " + txtProduto.getText() + " já está cadastrado. \nConsidere mudar o nome de seu novo produto!");
               txtProduto.requestFocus();
            } else {           
               JOptionPane.showMessageDialog(null, ex.getMessage());
            }
            
        }
                       
    }//GEN-LAST:event_btnSalvarProdutoActionPerformed
        private void limparTela() {
        txtProduto.setText("");                                  
        txtMarca.setText("");
        txtMedida.setText("");
        txtProduto.requestFocus();
    } 

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalvarProduto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblMedida;
    private javax.swing.JLabel lblProduto;
    private javax.swing.JLabel lblTituloProdutos;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtMedida;
    private javax.swing.JTextField txtProduto;
    // End of variables declaration//GEN-END:variables
}
