/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco_Dados.JDBC_Conexao;
import Modelo.Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Romen
 */
public class ClienteDAO {
    private JDBC_Conexao conect;
    private Cliente clientPesquisa;
    
    public ClienteDAO(){
        conect= new JDBC_Conexao();
        clientPesquisa= new Cliente(); //APENAS PARA PESQUISA
    }
    
    public void InserirCliente(Cliente cliente){
         conect.conexao();
         try {
             PreparedStatement pst= conect.conn.prepareStatement("insert into cliente(nome,sobrenome,cpf,rua,bairro,cidade_estado,cep,complemento,email,numero,celular,telefone)values(?,?,?,?,?,?,?,?,?,?,?,?)");
             pst.setString(1,cliente.getNome());
             pst.setString(2,cliente.getSobrenome());
             pst.setString(3,cliente.getCpf());
             pst.setString(4,cliente.getRua());
             pst.setString(5,cliente.getBairro());
             pst.setString(6,cliente.getCidade_estado());
             pst.setString(7,cliente.getCep());
             pst.setString(8,cliente.getComplemento());
             pst.setString(9,cliente.getEmail());
             pst.setString(10,cliente.getNumero());
             pst.setString(11,cliente.getCelular());
             pst.setString(12,cliente.getTelefone());
             pst.execute();
             conect.desconexao();
             JOptionPane.showMessageDialog(null,"Cadastro de Cliente Realizado com Sucesso!!");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Cliente"+ex);
            System.out.println(ex.getErrorCode());
         }
        
    }
    
    public Cliente PesquisarCliente(String pesquisar){
        conect.conexao();
        try{
            conect.executaSQL("select * from cliente where cpf like '%"+pesquisar+"%'");
            conect.rs.first();
            do{
              clientPesquisa.setId_cliente(conect.rs.getInt("id_cliente"));
              clientPesquisa.setNome(conect.rs.getString("nome"));
              clientPesquisa.setSobrenome(conect.rs.getString("sobrenome"));
              clientPesquisa.setCpf(conect.rs.getString("cpf"));
              clientPesquisa.setRua(conect.rs.getString("rua"));
              clientPesquisa.setNumero(conect.rs.getString("numero"));
              clientPesquisa.setComplemento(conect.rs.getString("complemento"));
              clientPesquisa.setBairro(conect.rs.getString("bairro"));
              clientPesquisa.setCidade_estado(conect.rs.getString("cidade_estado"));
              clientPesquisa.setEmail(conect.rs.getString("email"));
              clientPesquisa.setCep(conect.rs.getString("cep"));
              clientPesquisa.setTelefone(conect.rs.getString("telefone"));
              clientPesquisa.setCelular(conect.rs.getString("celular"));
            }while(conect.rs.next());
            conect.desconexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"CPF não Cadastrado");
            System.out.println(ex.getErrorCode());
         }
        return clientPesquisa;
    }
    public DefaultTableModel PesquisarTodos(){
        conect.conexao();
        DefaultTableModel m1 = new DefaultTableModel();
        m1.setColumnIdentifiers(new String[]{"ID","CPF","Nome","Sobrenome","Endereço"});      
        try {
            conect.executaSQL("select * from cliente");
            conect.rs.first();
            do{
               Object dados[]={conect.rs.getInt("id_cliente"),conect.rs.getString("cpf"),conect.rs.getString("nome"),conect.rs.getString("sobrenome"),conect.rs.getString("rua")+" Bairro:"+conect.rs.getString("bairro")+" "+conect.rs.getString("numero")+" "+conect.rs.getString("cidade_estado")};
               m1.addRow(dados);
            }while(conect.rs.next());
            conect.desconexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Não há clientes cadastrados!");
            System.out.println(ex.getErrorCode());
        }
        
         return m1; 
    }
    
    public void ExcluirClientes(String excluir){
        conect.conexao();
        try{
            PreparedStatement  pst = conect.conn.prepareStatement("delete from cliente where cpf= ?");
            pst.setString(1,excluir);
            pst.execute();
            JOptionPane.showMessageDialog(null,"Cliente excluído com Sucesso");
            conect.desconexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Excluir"+ex);
            System.out.println(ex.getErrorCode());
        }
       
    }
    public void EditarClientes(Cliente cliente){
        conect.conexao();
        try {
            //Comando SQL para capturar o ID do ultimo cliente cadastrado
            conect.executaSQL("select id_cliente from cliente");
            conect.rs.last();
            cliente.setId_cliente(conect.rs.getInt("id_cliente"));
           
        } catch (SQLException ex) {
        }
        
        try {
           PreparedStatement  pst = conect.conn.prepareStatement("update cliente set nome= ?, sobrenome= ?, cpf= ?, rua= ?, bairro= ?,cidade_estado= ?,cep= ?,complemento= ?,email= ?,numero= ?, celular= ?,telefone= ? where id_cliente= ?");
           pst.setString(1,cliente.getNome());
           pst.setString(2,cliente.getSobrenome());
           pst.setString(3,cliente.getCpf());
           pst.setString(4,cliente.getRua());
           pst.setString(5,cliente.getBairro());
           pst.setString(6,cliente.getCidade_estado());
           pst.setString(7,cliente.getCep());
           pst.setString(8,cliente.getComplemento());
           pst.setString(9,cliente.getEmail());
           pst.setString(10,cliente.getNumero());
           pst.setString(11,cliente.getCelular());
           pst.setString(12,cliente.getTelefone());
           pst.setInt(13,cliente.getId_cliente());
           pst.execute();
           conect.desconexao(); 
           JOptionPane.showMessageDialog(null,"Dados do Cliente alterado com Sucesso");
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro ao alterar cliente"+ex);
        }
    }
}