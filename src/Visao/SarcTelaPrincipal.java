/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import DAO.RevendedorDAO;
import Modelo.Revendedor;

/**
 *
 * @author Romen
 */
public class SarcTelaPrincipal extends javax.swing.JFrame {
     private Revendedor revendedor= new Revendedor();
     private RevendedorDAO revendedordao= new RevendedorDAO();
    /**
     * Creates new form SarcTelaPrincipal
     */
    public SarcTelaPrincipal() {
        initComponents();
        revendedor = revendedordao.PesquisarRevendedor();
        jlRevendedor.setText(revendedor.getNome()+" "+revendedor.getSobrenome());
        Cadastro_Revendedor reven= new Cadastro_Revendedor();
        reven.setVisible(true);
        
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
        jlRevendedor = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jmbTelaInicial = new javax.swing.JMenuBar();
        jmCadastro = new javax.swing.JMenu();
        jmCadatroProduto = new javax.swing.JMenu();
        jmEditarRevendedor = new javax.swing.JMenu();
        jmVendas = new javax.swing.JMenu();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jmRelatorios = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sistema de Auxílio a Revendedores de Cosméticos");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Serif", 3, 55)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("   SARC");
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 0, 0)));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setText("Seja Bem Vindo");

        jlRevendedor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jLabel3.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(128, 128, 128)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(106, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jlRevendedor, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 162, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(60, 60, 60))
        );

        jmbTelaInicial.setMargin(new java.awt.Insets(10, 10, 0, 0));

        jmCadastro.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jmCadastro.setText("Cadastrar Cliente");
        jmCadastro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCadastroMouseClicked(evt);
            }
        });
        jmCadastro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmCadastroActionPerformed(evt);
            }
        });
        jmbTelaInicial.add(jmCadastro);

        jmCadatroProduto.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jmCadatroProduto.setText("Cadastrar Produto");
        jmCadatroProduto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmCadatroProdutoMouseClicked(evt);
            }
        });
        jmbTelaInicial.add(jmCadatroProduto);

        jmEditarRevendedor.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jmEditarRevendedor.setText("Editar Revendedor");
        jmEditarRevendedor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmEditarRevendedorMouseClicked(evt);
            }
        });
        jmbTelaInicial.add(jmEditarRevendedor);

        jmVendas.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jmVendas.setText("Vendas");
        jmVendas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmVendasMouseClicked(evt);
            }
        });
        jmVendas.add(jSeparator1);

        jmbTelaInicial.add(jmVendas);

        jmRelatorios.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        jmRelatorios.setText("Relatórios de Vendas");
        jmRelatorios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmRelatoriosMouseClicked(evt);
            }
        });
        jmbTelaInicial.add(jmRelatorios);

        setJMenuBar(jmbTelaInicial);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jmCadastroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmCadastroActionPerformed
       Cadastro_Clientes cadastro= new Cadastro_Clientes();
       cadastro.setVisible(true);
    }//GEN-LAST:event_jmCadastroActionPerformed

    private void jmCadastroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCadastroMouseClicked
        Cadastro_Clientes cadastro= new Cadastro_Clientes();
        cadastro.setVisible(true);
    }//GEN-LAST:event_jmCadastroMouseClicked

    private void jmCadatroProdutoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmCadatroProdutoMouseClicked
        CadastroProduto produto= new CadastroProduto();
        produto.setVisible(true);
    }//GEN-LAST:event_jmCadatroProdutoMouseClicked

    private void jmEditarRevendedorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmEditarRevendedorMouseClicked
        EdicaoRevendedor editar= new EdicaoRevendedor();
        editar.setVisible(true);
    }//GEN-LAST:event_jmEditarRevendedorMouseClicked

    private void jmVendasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmVendasMouseClicked
        Compra compra= new Compra();
        compra.setVisible(true);
    }//GEN-LAST:event_jmVendasMouseClicked

    private void jmRelatoriosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmRelatoriosMouseClicked
        Relatorios relatorio= new Relatorios();
        relatorio.setVisible(true);
    }//GEN-LAST:event_jmRelatoriosMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SarcTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SarcTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SarcTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SarcTelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SarcTelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JLabel jlRevendedor;
    private javax.swing.JMenu jmCadastro;
    private javax.swing.JMenu jmCadatroProduto;
    private javax.swing.JMenu jmEditarRevendedor;
    private javax.swing.JMenu jmRelatorios;
    private javax.swing.JMenu jmVendas;
    private javax.swing.JMenuBar jmbTelaInicial;
    // End of variables declaration//GEN-END:variables
}
