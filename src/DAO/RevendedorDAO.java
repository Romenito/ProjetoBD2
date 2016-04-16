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
    
    
    public RevendedorDAO(){
        conect= new JDBC_Conexao();
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
            Logger.getLogger(RevendedorDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
