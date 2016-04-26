/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco_Dados.JDBC_Conexao;
import Modelo.Revendedor;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romen
 */
public class RevendedorDAO {
    private JDBC_Conexao conect;
    private Revendedor pesqRevendedor;
    
    
    public RevendedorDAO(){
        conect= new JDBC_Conexao();
        pesqRevendedor= new Revendedor();
    }
    
    public void InserirRevendedor(Revendedor revendedor){
        conect.conexao();
        try {
            PreparedStatement pst= conect.conn.prepareStatement("insert into revendedor(nome,sobrenome,cpf_revendedor,email) values(?,?,?,?)");
             pst.setString(1,revendedor.getNome());
             pst.setString(2,revendedor.getSobrenome());
             pst.setString(3,revendedor.getCpf_revendedor());
             pst.setString(4,revendedor.getEmail());
             pst.execute();
             conect.desconexao();
             JOptionPane.showMessageDialog(null,"Revendedor cadastrado com Sucesso ");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Não é ṕossível cadastrar Revendedor.");
        }
        
    }
    public void EditarRevendedor(Revendedor revendedor){
        conect.conexao();
         try {
            conect.executaSQL("select * from revendedor");
            conect.rs.last();
            revendedor.setId_revendedor(conect.rs.getInt("id_revendedor"));
        } catch (SQLException ex) {
            Logger.getLogger(RevendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PreparedStatement  pst = conect.conn.prepareStatement("update revendedor set nome= ?, sobrenome= ?, cpf_revendedor= ?, email= ? where id_revendedor= ?");
            pst.setString(1,revendedor.getNome());
            pst.setString(2,revendedor.getSobrenome());
            pst.setString(3,revendedor.getCpf_revendedor());
            pst.setString(4,revendedor.getEmail());
            pst.setInt(5,revendedor.getId_revendedor());
            pst.execute();
            conect.desconexao();
            JOptionPane.showMessageDialog(null,"Dados Editado com sucesso");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Editar Cadastro");
        }
    }
    public Revendedor PesquisarRevendedor(){
        conect.conexao();
       
        try {
            conect.executaSQL("select * from revendedor");
            conect.rs.last();
            pesqRevendedor.setNome(conect.rs.getString("nome"));
            pesqRevendedor.setSobrenome(conect.rs.getString("sobrenome"));
            pesqRevendedor.setEmail(conect.rs.getString("email"));
            pesqRevendedor.setCpf_revendedor(conect.rs.getString("cpf_revendedor"));
            conect.desconexao();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Não há Revendedor Cadastrado");
        }
        return pesqRevendedor;
    }
}
