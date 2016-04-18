/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco_Dados.JDBC_Conexao;
import Modelo.Administrador;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romen
 */
public class AdministradorDAO {
    private JDBC_Conexao conect;
    private Administrador pesqadm;
    
    
    public AdministradorDAO(){
        conect= new JDBC_Conexao();
        pesqadm= new Administrador();
    }
    
     public void InserirAdministrador(Administrador administrador){
        conect.conexao();
        try {
            conect.executaSQL("select * from revendedor");
            conect.rs.last();
            administrador.setId_revendedor(conect.rs.getInt("id_revendedor"));
        } catch (SQLException ex) {
            Logger.getLogger(AdministradorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            PreparedStatement pst= conect.conn.prepareStatement(" insert into administra(nome,telefone,email,id_revendedor) values(?,?,?,?)");
             pst.setString(1,administrador.getNome());
             pst.setString(2,administrador.getTelefone());
             pst.setString(3,administrador.getEmail());
             pst.setInt(4,administrador.getId_revendedor());
             pst.execute();
             conect.desconexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao cadastrar Adminstrador em Tabela"+ ex);
        }
        
    }
     public void EditarAdministrador(Administrador administrador){
          conect.conexao();
        
        try {
            conect.executaSQL("select * from administra");
            conect.rs.last();
            administrador.setId_revendedor(conect.rs.getInt("id_revendedor"));
        } catch (SQLException ex) {
            Logger.getLogger(RevendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            PreparedStatement  pst = conect.conn.prepareStatement("update administra set nome= ?,email= ?, telefone= ? where id_revendedor= ?");
            pst.setString(1,administrador.getNome());
            pst.setString(2,administrador.getEmail());
            pst.setString(3,administrador.getTelefone());
            pst.setInt(4,administrador.getId_revendedor());
            pst.execute();
            conect.desconexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao Editar Dados de Administrador"+ex);
        }
      }
     public Administrador PesquisarAdministrador(){
        conect.conexao();
       
        try {
            conect.executaSQL("select * from administra");
            conect.rs.last();
            pesqadm.setNome(conect.rs.getString("nome"));
            pesqadm.setEmail(conect.rs.getString("email"));
            pesqadm.setTelefone(conect.rs.getString("telefone"));
            conect.desconexao();
        } catch (SQLException ex) {
          
        }
        return pesqadm;
    }
   }
    

