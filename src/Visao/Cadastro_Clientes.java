/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Visao;

import DAO.ClienteDAO;
//import DAO.Telefone_ClienteDAO;
import Modelo.Cliente;
//import Modelo.Telefone_Cliente;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Romen
 */
public class Cadastro_Clientes extends javax.swing.JFrame {

    private Cliente cliente= new Cliente();
    private String pesquisa;
    private ClienteDAO clientedao= new ClienteDAO();
   
    public Cadastro_Clientes() {
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
        jLabel2 = new javax.swing.JLabel();
        jtfNomeClientes = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfSobrenomeClientes = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtfCpfClientes = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jtfBairroClientes = new javax.swing.JTextField();
        jtfRuaClientes = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfNumeroClientes = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jtfCepClientes = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jtfComplementoClientes = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jtfCidadeClientes = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jtfTelefoneClientes = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jtfCelularClientes = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jtfEmailClientes = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jbSalvarClientes = new javax.swing.JButton();
        jbCancelarClientes = new javax.swing.JButton();
        jbNovoClientes = new javax.swing.JButton();
        jbExcluirClientes = new javax.swing.JButton();
        jbEditarClientes = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        jtfPesquisarClientes = new javax.swing.JTextField();
        jbPesquisarClientes = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtClientesCadastrados = new javax.swing.JTable();
        jCheckBox1 = new javax.swing.JCheckBox();
        jbSairCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Clientes");

        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(204, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Nome:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 80, -1, -1));

        jtfNomeClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfNomeClientes.setEnabled(false);
        jPanel1.add(jtfNomeClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 90, -1));

        jLabel3.setText("Sobrenome:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, -1));

        jtfSobrenomeClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfSobrenomeClientes.setEnabled(false);
        jPanel1.add(jtfSobrenomeClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 80, 140, -1));

        jLabel4.setText("CPF:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jtfCpfClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfCpfClientes.setEnabled(false);
        jPanel1.add(jtfCpfClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 90, -1));

        jLabel5.setText("Bairro:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 120, -1, -1));

        jtfBairroClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfBairroClientes.setEnabled(false);
        jPanel1.add(jtfBairroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 90, -1));

        jtfRuaClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfRuaClientes.setEnabled(false);
        jPanel1.add(jtfRuaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, 90, -1));

        jLabel6.setText("Rua:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        jLabel7.setText("N°:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, -1, -1));

        jtfNumeroClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfNumeroClientes.setEnabled(false);
        jPanel1.add(jtfNumeroClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 40, -1));

        jLabel8.setText("CEP:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, -1, -1));

        jtfCepClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfCepClientes.setEnabled(false);
        jPanel1.add(jtfCepClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 90, -1));

        jLabel9.setText("Complemento:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        jtfComplementoClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfComplementoClientes.setEnabled(false);
        jPanel1.add(jtfComplementoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 80, -1));

        jLabel10.setText("Cidade/UF:");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, -1, -1));

        jtfCidadeClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfCidadeClientes.setEnabled(false);
        jPanel1.add(jtfCidadeClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, 190, -1));

        jLabel11.setText("Telefone:");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        jtfTelefoneClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfTelefoneClientes.setEnabled(false);
        jPanel1.add(jtfTelefoneClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 80, -1));

        jLabel12.setText("Celular:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 210, -1, -1));

        jtfCelularClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfCelularClientes.setEnabled(false);
        jPanel1.add(jtfCelularClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 80, -1));

        jLabel13.setText("Email:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 210, -1, -1));

        jtfEmailClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jtfEmailClientes.setEnabled(false);
        jtfEmailClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfEmailClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jtfEmailClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 200, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cadastro de Cliente");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 300, 26));

        jbSalvarClientes.setText("Salvar");
        jbSalvarClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbSalvarClientes.setEnabled(false);
        jbSalvarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jbSalvarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, 90, 30));

        jbCancelarClientes.setText("Cancelar");
        jbCancelarClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbCancelarClientes.setEnabled(false);
        jbCancelarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jbCancelarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 260, 90, 30));

        jbNovoClientes.setText("Novo Cadastro");
        jbNovoClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbNovoClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNovoClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jbNovoClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, 90, 30));

        jbExcluirClientes.setText("Excluir");
        jbExcluirClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbExcluirClientes.setEnabled(false);
        jbExcluirClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jbExcluirClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 90, 30));

        jbEditarClientes.setText("Editar");
        jbEditarClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbEditarClientes.setEnabled(false);
        jbEditarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jbEditarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 260, 90, 30));

        jLabel15.setText("Procurar Clientes:");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, -1, -1));

        jtfPesquisarClientes.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(0, 0, 0), null));
        jPanel1.add(jtfPesquisarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 200, -1));

        jbPesquisarClientes.setText("Pesquisar");
        jbPesquisarClientes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbPesquisarClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPesquisarClientesActionPerformed(evt);
            }
        });
        jPanel1.add(jbPesquisarClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 90, 30));

        jtClientesCadastrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "CPF", "Nome", "Sobrenome", "Endereço"
            }
        ));
        jtClientesCadastrados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtClientesCadastradosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtClientesCadastrados);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 630, 210));

        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jCheckBox1.setText("Todos");
        jCheckBox1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 310, -1, -1));

        jbSairCliente.setText("Sair");
        jbSairCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jbSairCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSairClienteActionPerformed(evt);
            }
        });
        jPanel1.add(jbSairCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 260, 90, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 642, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 569, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbNovoClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNovoClientesActionPerformed
       ((DefaultTableModel)jtClientesCadastrados.getModel()).setNumRows(0);
        jtClientesCadastrados.updateUI();
        jtfCpfClientes.setEnabled(true);
        jtfNomeClientes.setEnabled(true);
        jtfSobrenomeClientes.setEnabled(true);
        jtfRuaClientes.setEnabled(true);
        jtfCepClientes.setEnabled(true);
        jtfCidadeClientes.setEnabled(true);
        jtfEmailClientes.setEnabled(true);
        jtfTelefoneClientes.setEnabled(true);
        jtfBairroClientes.setEnabled(true);
        jtfComplementoClientes.setEnabled(true);
        jtfNumeroClientes.setEnabled(true);
        jtfCelularClientes.setEnabled(true);
        jbCancelarClientes.setEnabled(true);
        jbSalvarClientes.setEnabled(true);
        jbNovoClientes.setEnabled(false);
        jbEditarClientes.setEnabled(false);
        jbExcluirClientes.setEnabled(false);
        limparCampos();
    }//GEN-LAST:event_jbNovoClientesActionPerformed

    private void jbEditarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarClientesActionPerformed
        cliente.setId_cliente(Integer.parseInt(String.valueOf(jtClientesCadastrados.getValueAt(jtClientesCadastrados.getSelectedRow(), 0))));
        cliente.setNome(jtfNomeClientes.getText());
        cliente.setSobrenome(jtfSobrenomeClientes.getText());
        cliente.setCpf(jtfCpfClientes.getText());
        cliente.setCidade_estado(jtfCidadeClientes.getText());
        cliente.setBairro(jtfBairroClientes.getText());
        cliente.setComplemento(jtfComplementoClientes.getText());
        cliente.setCep(jtfCepClientes.getText());
        cliente.setRua(jtfRuaClientes.getText());
        cliente.setEmail(jtfEmailClientes.getText());
        cliente.setNumero(jtfNumeroClientes.getText());
        cliente.setTelefone(jtfTelefoneClientes.getText());
        cliente.setCelular(jtfCelularClientes.getText());
        //salva os dados no banco
        clientedao.EditarClientes(cliente);
        limparCampos(); 
        jbSalvarClientes.setEnabled(false);
        jbCancelarClientes.setEnabled(false);
        jbNovoClientes.setEnabled(true);
        jbExcluirClientes.setEnabled(false);
        jbEditarClientes.setEnabled(false);
        jtfCpfClientes.setEnabled(false);
        jtfNomeClientes.setEnabled(false);
        jtfSobrenomeClientes.setEnabled(false);
        jtfRuaClientes.setEnabled(false);
        jtfCepClientes.setEnabled(false);
        jtfCidadeClientes.setEnabled(false);
        jtfEmailClientes.setEnabled(false);
        jtfTelefoneClientes.setEnabled(false);
        jtfBairroClientes.setEnabled(false);
        jtfComplementoClientes.setEnabled(false);
        jtfNumeroClientes.setEnabled(false);
        jtfCelularClientes.setEnabled(false);
       
    }//GEN-LAST:event_jbEditarClientesActionPerformed

    private void jbSalvarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarClientesActionPerformed
        jbNovoClientes.setEnabled(true);
        jbSalvarClientes.setEnabled(false);
        cliente.setNome(jtfNomeClientes.getText());
        cliente.setSobrenome(jtfSobrenomeClientes.getText());
        cliente.setCpf(jtfCpfClientes.getText());
        cliente.setCidade_estado(jtfCidadeClientes.getText());
        cliente.setBairro(jtfBairroClientes.getText());
        cliente.setComplemento(jtfComplementoClientes.getText());
        cliente.setCep(jtfCepClientes.getText());
        cliente.setRua(jtfRuaClientes.getText());
        cliente.setEmail(jtfEmailClientes.getText());
        cliente.setNumero(jtfNumeroClientes.getText());
        cliente.setTelefone(jtfTelefoneClientes.getText());
        cliente.setCelular(jtfCelularClientes.getText());
        clientedao.InserirCliente(cliente);   
        limparCampos();   
        jtfCpfClientes.setEnabled(false);
        jtfNomeClientes.setEnabled(false);
        jtfSobrenomeClientes.setEnabled(false);
        jtfRuaClientes.setEnabled(false);
        jtfCepClientes.setEnabled(false);
        jtfCidadeClientes.setEnabled(false);
        jtfEmailClientes.setEnabled(false);
        jtfTelefoneClientes.setEnabled(false);
        jtfBairroClientes.setEnabled(false);
        jtfComplementoClientes.setEnabled(false);
        jtfNumeroClientes.setEnabled(false);
        jtfCelularClientes.setEnabled(false);
        jbCancelarClientes.setEnabled(false);
    }//GEN-LAST:event_jbSalvarClientesActionPerformed

    private void jbCancelarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarClientesActionPerformed
        jtfCpfClientes.setEnabled(false);
        jtfNomeClientes.setEnabled(false);
        jtfSobrenomeClientes.setEnabled(false);
        jtfRuaClientes.setEnabled(false);
        jtfCepClientes.setEnabled(false);
        jtfCidadeClientes.setEnabled(false);
        jtfEmailClientes.setEnabled(false);
        jtfTelefoneClientes.setEnabled(false);
        jtfBairroClientes.setEnabled(false);
        jtfComplementoClientes.setEnabled(false);
        jtfNumeroClientes.setEnabled(false);
        jtfCelularClientes.setEnabled(false);
        jbCancelarClientes.setEnabled(false);
        jbSalvarClientes.setEnabled(false);
        limparCampos();
    }//GEN-LAST:event_jbCancelarClientesActionPerformed

    private void jbPesquisarClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPesquisarClientesActionPerformed
        ((DefaultTableModel)jtClientesCadastrados.getModel()).setNumRows(0);
        jtClientesCadastrados.updateUI();
        DefaultTableModel m1 = new DefaultTableModel();
        m1.setColumnIdentifiers(new String[]{"ID","CPF","Nome","Sobrenome","Endereço"});
        cliente=clientedao.PesquisarCliente(jtfPesquisarClientes.getText());
        //Adicionar detalhes ao ENDEREÇO
        Object dados[]={cliente.getId_cliente(),cliente.getCpf(),cliente.getNome(),cliente.getSobrenome(),cliente.getRua()+" Bairro:"+cliente.getBairro()+" "+cliente.getNumero()+" "+cliente.getCidade_estado()};
        m1.addRow(dados);
        jtClientesCadastrados.setModel(m1);//Inserindo os dados em uma JTable
        
    }//GEN-LAST:event_jbPesquisarClientesActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        jtClientesCadastrados.setModel(clientedao.PesquisarTodos());
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jtClientesCadastradosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtClientesCadastradosMouseClicked
        jtfCpfClientes.setEnabled(true);
        jtfNomeClientes.setEnabled(true);
        jtfSobrenomeClientes.setEnabled(true);
        jtfRuaClientes.setEnabled(true);
        jtfCepClientes.setEnabled(true);
        jtfCidadeClientes.setEnabled(true);
        jtfEmailClientes.setEnabled(true);
        jtfTelefoneClientes.setEnabled(true);
        jtfBairroClientes.setEnabled(true);
        jtfComplementoClientes.setEnabled(true);
        jtfNumeroClientes.setEnabled(true);
        jtfCelularClientes.setEnabled(true);
        jbSalvarClientes.setEnabled(false);
        jbEditarClientes.setEnabled(true);
        jbExcluirClientes.setEnabled(true);
        pesquisa=""+jtClientesCadastrados.getValueAt(jtClientesCadastrados.getSelectedRow(),1);
        //System.out.println("CPF "+pesquisa);
        cliente=clientedao.PesquisarCliente(pesquisa);
        jtfCpfClientes.setText(cliente.getCpf());
        jtfNomeClientes.setText(cliente.getNome());
        jtfSobrenomeClientes.setText(cliente.getSobrenome());
        jtfRuaClientes.setText(cliente.getRua());
        jtfCepClientes.setText(cliente.getCep());
        jtfCidadeClientes.setText(cliente.getCidade_estado());
        jtfEmailClientes.setText(cliente.getEmail());
        jtfBairroClientes.setText(cliente.getBairro());
        jtfComplementoClientes.setText(cliente.getComplemento());
        jtfNumeroClientes.setText(cliente.getNumero());
        jtfTelefoneClientes.setText(cliente.getTelefone());
        jtfCelularClientes.setText(cliente.getCelular());
    }//GEN-LAST:event_jtClientesCadastradosMouseClicked

    private void jtfEmailClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfEmailClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfEmailClientesActionPerformed

    private void jbExcluirClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirClientesActionPerformed
       jbSalvarClientes.setEnabled(false);
       jbCancelarClientes.setEnabled(false);
       jbNovoClientes.setEnabled(true);
       clientedao.ExcluirClientes(jtfCpfClientes.getText());
       limparCampos();
       jtfCpfClientes.setEnabled(false);
       jtfNomeClientes.setEnabled(false);
       jtfSobrenomeClientes.setEnabled(false);
       jtfRuaClientes.setEnabled(false);
       jtfCepClientes.setEnabled(false);
       jtfCidadeClientes.setEnabled(false);
       jtfEmailClientes.setEnabled(false);
       jtfTelefoneClientes.setEnabled(false);
       jtfBairroClientes.setEnabled(false);
       jtfComplementoClientes.setEnabled(false);
       jtfNumeroClientes.setEnabled(false);
       jtfCelularClientes.setEnabled(false);
       jbExcluirClientes.setEnabled(false);
       jbEditarClientes.setEnabled(false);
       
    }//GEN-LAST:event_jbExcluirClientesActionPerformed

    private void jbSairClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSairClienteActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jbSairClienteActionPerformed

    private void jtfCpfClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfCpfClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfCpfClientesActionPerformed

    private void jtfBairroClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfBairroClientesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfBairroClientesActionPerformed

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
            java.util.logging.Logger.getLogger(Cadastro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Cadastro_Clientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Cadastro_Clientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelarClientes;
    private javax.swing.JButton jbEditarClientes;
    private javax.swing.JButton jbExcluirClientes;
    private javax.swing.JButton jbNovoClientes;
    private javax.swing.JButton jbPesquisarClientes;
    private javax.swing.JButton jbSairCliente;
    private javax.swing.JButton jbSalvarClientes;
    private javax.swing.JTable jtClientesCadastrados;
    private javax.swing.JTextField jtfBairroClientes;
    private javax.swing.JTextField jtfCelularClientes;
    private javax.swing.JTextField jtfCepClientes;
    private javax.swing.JTextField jtfCidadeClientes;
    private javax.swing.JTextField jtfComplementoClientes;
    private javax.swing.JTextField jtfCpfClientes;
    private javax.swing.JTextField jtfEmailClientes;
    private javax.swing.JTextField jtfNomeClientes;
    private javax.swing.JTextField jtfNumeroClientes;
    private javax.swing.JTextField jtfPesquisarClientes;
    private javax.swing.JTextField jtfRuaClientes;
    private javax.swing.JTextField jtfSobrenomeClientes;
    private javax.swing.JTextField jtfTelefoneClientes;
    // End of variables declaration//GEN-END:variables

public void limparCampos(){
    jtfPesquisarClientes.setText("");
    jtfCpfClientes.setText("");
    jtfNomeClientes.setText("");
    jtfSobrenomeClientes.setText("");
    jtfRuaClientes.setText("");
    jtfCepClientes.setText("");
    jtfCidadeClientes.setText("");
    jtfEmailClientes.setText("");
    jtfTelefoneClientes.setText("");
    jtfBairroClientes.setText("");
    jtfComplementoClientes.setText("");
    jtfNumeroClientes.setText("");
    jtfCelularClientes.setText("");
}

}
