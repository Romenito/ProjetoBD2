/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco_Dados.JDBC_Conexao;
import Modelo.Telefone_Cliente;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Romen
 */
public class Telefone_ClienteDAO {
    private Telefone_Cliente tele;
    private JDBC_Conexao conect;
    
    public Telefone_ClienteDAO(){
        conect= new JDBC_Conexao();
        tele= new Telefone_Cliente();
    }
    
    public void InserirTelefone(Telefone_Cliente tel){
        conect.conexao();
        try {
            //Comando SQL para capturar o ID do ultimo cliente cadastrado
            conect.executaSQL("select id_cliente from cliente");
            conect.rs.last();
            tel.setId_cliente(conect.rs.getInt("id_cliente"));
           
        } catch (SQLException ex) {
        }
        
        try {
            PreparedStatement pst= conect.conn.prepareStatement("insert into telefone_cliente(id_cliente,telefone)values(?,?)");
            pst.setInt(1,tel.getId_cliente());
            pst.setString(2,tel.getTelefone());
            pst.execute();
            conect.desconexao();
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null,"Erro ao Cadastrar Telefone"+ex);
        }
         
    }
    public Telefone_Cliente PesquisarTelefone(int pesquisar,String telefone){
        conect.conexao();
        try {
            conect.executaSQL("select * from telefone_cliente where id_cliente='"+pesquisar+"' and telefone <>'"+telefone+"'");
            conect.rs.first();
            do{
               tele.setTelefone(conect.rs.getString("telefone"));   
            }while(conect.rs.next());
            conect.desconexao();
        } catch (SQLException ex) {
        }
           return tele;
       
    }
    public void EditarTelefone(Telefone_Cliente tel){
        conect.conexao();
        try {
            //Comando SQL para capturar o ID do ultimo cliente cadastrado
            conect.executaSQL("select id_cliente from cliente");
            conect.rs.last();
            tel.setId_cliente(conect.rs.getInt("id_cliente"));
           
        } catch (SQLException ex) {
        }
        try {
            PreparedStatement  pst = conect.conn.prepareStatement("update telefone_cliente set telefone= ? where id_cliente= ? and telefone= ?");
            pst.setString(1,tel.getTelefone());
            pst.setInt(2,tel.getId_cliente());
            pst.setString(3,tel.getTelefone());
            pst.execute();
            conect.desconexao();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Erro ao atualizar Telefone"+ex);
        }
           
    }
    
}
