/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco_Dados.JDBC_Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Romen
 */
public class RelatoriosDAO {
    private JDBC_Conexao conect;
    
    public RelatoriosDAO(){
        
        conect = new JDBC_Conexao();
    }
    
    public DefaultTableModel PesquisarTodos(){
        conect.conexao();
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]{"ID","Ciclo/Campanha","Nome","Codigo","Descrição","Data","Valor","Status de Pagamento"});      
        try {
            conect.executaSQL("select * from cliente a join compra b on b.id_cliente=a.id_cliente join produto c on c.id_produto=b.id_produto");
            conect.rs.first();
            do{
               Object dados[]={conect.rs.getInt("codigo_compra"),conect.rs.getString("ciclo_campanha"),conect.rs.getString("nome")+" "+conect.rs.getString("sobrenome"),conect.rs.getString("codigo_revista"),conect.rs.getString("nome_produto")+"/"+conect.rs.getString("descricao")+"/"+conect.rs.getString("fornecedor"),conect.rs.getString("data_compra"),conect.rs.getDouble("valor"),conect.rs.getString("status_compra")};
               m.addRow(dados);
            }while(conect.rs.next());
            conect.desconexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Sem Compra Efetivada !");
        }
        
         return m; 
    }
    
    public DefaultTableModel PesquisarCicloFornecedor(String ciclo, String fornecedor){
        conect.conexao();
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]{"ID","Ciclo/Campanha","Nome","Codigo","Fornecedor","Valor"});      
        try {
            conect.executaSQL("select * from cliente a join compra b on b.id_cliente=a.id_cliente "
                    + "join produto c on c.id_produto=b.id_produto "
                    + "where ciclo_campanha='"+ciclo+"' and fornecedor='"+fornecedor+"'");
            conect.rs.first();
            do{
               Object dados[]={conect.rs.getInt("codigo_compra"),conect.rs.getString("ciclo_campanha"),conect.rs.getString("nome")+" "+conect.rs.getString("sobrenome"),conect.rs.getString("codigo_revista"),conect.rs.getString("fornecedor"),conect.rs.getDouble("valor")};
               m.addRow(dados);
            }while(conect.rs.next());
               conect.desconexao();
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Sem Compra Efetivada !");

        }
        
        return m; 
    }
       
    public DefaultTableModel PesquisarStatus(){
        conect.conexao();
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]{"ID","Ciclo/Campanha","Nome","Descrição","Fornecedor","Status de Pagamento","Valor"});      
        try {
            conect.executaSQL("select * from cliente a "
                             + "join compra b on b.id_cliente=a.id_cliente "
                             + " join produto c on c.id_produto=b.id_produto where b.status_compra='Pendente'");
            conect.rs.first();
            do{
               Object dados[]={conect.rs.getInt("codigo_compra"),conect.rs.getString("ciclo_campanha"),conect.rs.getString("nome")+" "+conect.rs.getString("sobrenome"),conect.rs.getString("nome_produto")+"/"+conect.rs.getString("descricao"),
                   conect.rs.getString("fornecedor"),conect.rs.getString("status_compra"),conect.rs.getDouble("valor")};
               m.addRow(dados);
            }while(conect.rs.next());
               conect.desconexao();
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Sem Compra Efetivada !");
        }
        
         return m; 
    }
        
    public void EnviarRelatorio(){
         JOptionPane.showMessageDialog(null, "Relatório enviado com sucesso");
    }
}
