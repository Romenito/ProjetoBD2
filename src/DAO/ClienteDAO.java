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
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Romen
 */
public class ClienteDAO {
    private JDBC_Conexao conect;
    private Cliente client;
    
    public ClienteDAO(){
        conect= new JDBC_Conexao();
        client= new Cliente();
    }
    
    public void InserirCliente(Cliente cliente){
         conect.conexao();
         try {
             
             PreparedStatement pst= conect.conn.prepareStatement("insert into cliente(nome,sobrenome,cpf,rua,bairro,cidade_estado,cep,complemento,email,numero)values(?,?,?,?,?,?,?,?,?,?)");
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
             pst.execute();
             conect.desconexao();
             JOptionPane.showMessageDialog(null,"Cadastro de Cliente Realizado com Sucesso!!");
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Cliente"+ex);
         }
        
    }
    public Cliente PesquisarCliente(String pesquisar){
        conect.conexao();
        try{
            conect.executaSQL("select * from cliente where cpf like '%"+pesquisar+"%'");
            conect.rs.first();
            do{
              client.setId_cliente(conect.rs.getInt("id_cliente"));
              client.setNome(conect.rs.getString("nome"));
              client.setSobrenome(conect.rs.getString("sobrenome"));
              client.setCpf(conect.rs.getString("cpf"));
              client.setRua(conect.rs.getString("rua"));
              client.setNumero(conect.rs.getString("numero"));
              client.setComplemento(conect.rs.getString("complemento"));
              client.setBairro(conect.rs.getString("bairro"));
              client.setCidade_estado(conect.rs.getString("cidade_estado"));
              client.setEmail(conect.rs.getString("email"));
              client.setCep(conect.rs.getString("cep"));
            }while(conect.rs.next());
            conect.desconexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"CPF não Cadastrado");
         }
        return client;
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
            JOptionPane.showMessageDialog(null,"Erro ao Pesquisar todos");
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
           PreparedStatement  pst = conect.conn.prepareStatement("update cliente set nome= ?, sobrenome= ?, cpf= ?, rua= ?, bairro= ?,cidade_estado= ?,cep= ?,complemento= ?,email= ?,numero= ? where id_cliente= ?");
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
           pst.setInt(11,cliente.getId_cliente());
           pst.execute();
           conect.desconexao(); 
           JOptionPane.showMessageDialog(null,"Dados do Cliente alterado com Sucesso");
        
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null," Erro ao alterar cliente"+ex);
        }
    }
}