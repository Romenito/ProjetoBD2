/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banco_Dados;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Romen
 */
public class JDBC_Conexao {
    public Statement stm;//responsavél por preparar e realizar pesquisas no banco de dados
    public  ResultSet rs;//responsavél por armazenar o resultado de uma pesquisa passada para o statement 
    private String driver="com.mysql.jdbc.Driver";//responsavél por identificar o serviço de banco de dados
    private String caminho= "jdbc:mysql://localhost:3306/sistemarevendedor2";//responsavel por seta o local no banco de dados;
    private String usuario="root";
    private String senha="";
    public Connection conn;//responsavél por realizar a conexão com o banco de dados 
    
    
    public void desconexao(){//metodo para fechar a conexao com o banco de dados 
        try {
            conn.close();//fecha a conexao;
        } catch (SQLException ex) {
          JOptionPane.showMessageDialog(null,"Falha ao fechar a Conexão"+ex.getMessage());
        }
    }

    public void conexao() {
       try {
           System.setProperty("jdbc.Drivers", driver);//seta a propriedade do driver de conexao
           conn=DriverManager.getConnection(caminho,usuario,senha);//realiza a conexao com o banco de dados
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Falha na Conexão"+ex.getMessage());
        }
    }
    public void executaSQL(String sql){
        try {
            stm=conn.createStatement(rs.TYPE_SCROLL_INSENSITIVE,rs.CONCUR_READ_ONLY) ;
            rs=stm.executeQuery(sql);
        } catch (SQLException ex) {
           // Logger.getLogger(Conexao_BancoDados.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

