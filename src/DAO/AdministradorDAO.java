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
    
    
    public AdministradorDAO(){
        conect= new JDBC_Conexao();
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
}
