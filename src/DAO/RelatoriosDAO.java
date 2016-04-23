/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco_Dados.JDBC_Conexao;
import Modelo.Cliente;
import Modelo.Compra;
import Modelo.Produto;
import java.io.InputStream;
import java.sql.SQLException;
import java.util.HashMap;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRResultSetDataSource;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;

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
        m.setColumnIdentifiers(new String[]{"ID","Ciclo/Campanha","Nome","Codigo","Descrição","Fornecedor","Quantidade","Valor","Status de Pagamento"});      
        try {
            conect.executaSQL("select * from cliente a join compra b on b.id_cliente=a.id_cliente join produto c on c.id_produto=b.id_produto");
            conect.rs.first();
            do{
               Object dados[]={conect.rs.getInt("codigo_compra"),conect.rs.getString("ciclo_campanha"),conect.rs.getString("nome")+" "+conect.rs.getString("sobrenome"),conect.rs.getString("codigo_revista"),conect.rs.getString("nome_produto")+" "+conect.rs.getString("descricao"),conect.rs.getString("fornecedor"),conect.rs.getInt("quantidade"),conect.rs.getDouble("valor"),conect.rs.getString("status_compra")};
               m.addRow(dados);
            }while(conect.rs.next());
            conect.desconexao();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Sem Compra Efetivada !");
            System.out.println(ex.getErrorCode());
        }
        
         return m; 
    }
    
    public DefaultTableModel PesquisarCicloFornecedor(String ciclo, String fornecedor){
        conect.conexao();
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]{"ID","Ciclo/Campanha","Nome","Codigo","Fornecedor","Quantidade","Valor"});      
        try {
            conect.executaSQL("select * from cliente a join compra b on b.id_cliente=a.id_cliente "
                    + "join produto c on c.id_produto=b.id_produto "
                    + "where ciclo_campanha='"+ciclo+"' and fornecedor='"+fornecedor+"'");
            conect.rs.first();
            do{
               Object dados[]={conect.rs.getInt("codigo_compra"),conect.rs.getString("ciclo_campanha"),conect.rs.getString("nome")+" "+conect.rs.getString("sobrenome"),conect.rs.getString("codigo_revista"),conect.rs.getString("fornecedor"),conect.rs.getInt("quantidade_produto"),conect.rs.getDouble("valor")};
               m.addRow(dados);
            }while(conect.rs.next());
               conect.desconexao();
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Sem Compra Efetivada !");
              System.out.println(ex.getErrorCode());
        }
        
        return m; 
    }
       
    public DefaultTableModel PesquisarStatus(){
        conect.conexao();
        DefaultTableModel m = new DefaultTableModel();
        m.setColumnIdentifiers(new String[]{"ID","Ciclo/Campanha","Nome","Descrição","Fornecedor","Valor Total","Status de Pagamento"});      
        try {
            conect.executaSQL("select * from cliente a "
                             + "join compra b on b.id_cliente=a.id_cliente "
                             + " join produto c on c.id_produto=b.id_produto");
            conect.rs.first();
            do{
               Object dados[]={conect.rs.getInt("codigo_compra"),conect.rs.getString("ciclo_campanha"),conect.rs.getString("nome")+" "+conect.rs.getString("sobrenome"),conect.rs.getString("nome_produto")+" "+conect.rs.getString("descricao"),conect.rs.getString("fornecedor"),conect.rs.getDouble("valor_total"),conect.rs.getString("status_compra")};
               m.addRow(dados);
            }while(conect.rs.next());
               conect.desconexao();
        } catch (SQLException ex) {
              JOptionPane.showMessageDialog(null,"Sem Compra Efetivada !");
              System.out.println(ex.getErrorCode());
        }
        
         return m; 
    }
        
    public void EnviarRelatorio(){
          conect.conexao();
          try{
            conect.executaSQL("select * from cliente a "
                             + "join compra b on b.id_cliente=a.id_cliente "
                             + " join produto c on c.id_produto=b.id_produto");
            JRResultSetDataSource relatResul = new JRResultSetDataSource(conect.rs);// passa um result set preenchido para o relatorio
            InputStream stream = getClass().getResourceAsStream("/Relatorios/RelatorioVenda.jasper");
            JasperPrint jpPrint = JasperFillManager.fillReport(stream, new HashMap(),relatResul);//indicando o caminho onde sera encontrado o relatorio procurado        
            JasperViewer jv= new JasperViewer(jpPrint,false);//cria instacia de impressao
            jv.setVisible(true);//chama o relatorio para a visualização
            conect.desconexao();
        }catch(JRException ex){
            JOptionPane.showMessageDialog(null,"Erro ao chamar relatotio"+ ex);
        }
    
        
    }
}
