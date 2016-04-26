/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco_Dados.JDBC_Conexao;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Romen
 */
public class CompraDAO {
    private JDBC_Conexao conectaBD = new JDBC_Conexao();
    
    public void finalizarCompra(List<Integer> idsProd,int idCliente,List<String> statusPag,List<String> statusEnt,Timestamp dataAtual){
        
        conectaBD.conexao();
        try {
            for(int i=0;i<idsProd.size();i++){
                PreparedStatement consultaBD = conectaBD.conn.prepareStatement("INSERT INTO compra "
                    + "(entrega_cliente,status_compra,id_produto,id_revendedor,id_cliente,data_compra,data_entrega,codigo_compra) "
                    + "VALUES(?,?,?,?,?,?,?,?)");   
                consultaBD.setString(1, statusEnt.get(i));
                consultaBD.setString(2, statusPag.get(i));
                consultaBD.setInt(3, idsProd.get(i));
                consultaBD.setInt(4, 1);
                consultaBD.setInt(5, idCliente);
                consultaBD.setTimestamp(6, dataAtual);
                consultaBD.setTimestamp(7, dataAtual);
                consultaBD.setInt(8, (idCliente+idsProd.size()));
                consultaBD.execute();
            }
            conectaBD.desconexao();
            JOptionPane.showMessageDialog(null, "Compra finalizada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao finalizar compra.");
        }
    }
}
