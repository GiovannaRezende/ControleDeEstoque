package telas;

public class ConsultaEstoque extends javax.swing.JFrame {


    public ConsultaEstoque() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTituloConsulta = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblEstoque = new javax.swing.JTable();

        setTitle("Consulta o histórico de seu estoque!");
        getContentPane().setLayout(null);

        lblTituloConsulta.setText("CONSULTA DE ESTOQUE");
        getContentPane().add(lblTituloConsulta);
        lblTituloConsulta.setBounds(20, 20, 190, 16);

        tblEstoque.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        tblEstoque.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "MARCA", "QTD DISPONÍVEL", "CUSTO"
            }
        ));
        jScrollPane1.setViewportView(tblEstoque);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(40, 70, 520, 250);

        setSize(new java.awt.Dimension(614, 407));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblTituloConsulta;
    private javax.swing.JTable tblEstoque;
    // End of variables declaration//GEN-END:variables
}
