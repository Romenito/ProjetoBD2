/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import Banco_Dados.JDBC_Conexao;
import Modelo.Produto;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Romen
 */
public class ProdutoDAO {
    private JDBC_Conexao conectaBD = new JDBC_Conexao();
    
    public void inserirProduto(Produto dadosProd){
        conectaBD.conexao();
        try {
            PreparedStatement consultaBD = conectaBD.conn.prepareStatement("INSERT INTO produto(nome,codigo_revista,descricao,valor,unid_medida,quantidade_ml,fornecedor,ciclo_campanha) VALUES(?,?,?,?,?,?,?,?)");
            consultaBD.setString(1, dadosProd.getNome());
            consultaBD.setString(2, dadosProd.getCodigo_revista());
            consultaBD.setString(3,dadosProd.getDescricao());
            consultaBD.setDouble(4,dadosProd.getValor());
            consultaBD.setString(5,dadosProd.getUnidade_medida());
            consultaBD.setInt(6,dadosProd.getQuantidade_ml());
            consultaBD.setString(7,dadosProd.getFornecedor());
            consultaBD.setString(8,dadosProd.getCiclo_campanha());
            consultaBD.execute();
            conectaBD.desconexao();
            JOptionPane.showMessageDialog(null,"Produto cadastrado com sucesso!");
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao Cadastrar produto! \ncod. Erro: "+ex.toString());
        }
    }
    
    public void excluirProduto(int idProduto){
        conectaBD.conexao();
        try {
            PreparedStatement consultaBD = conectaBD.conn.prepareStatement("DELETE FROM produto WHERE id_produto=(?)");
            consultaBD.setInt(1, idProduto);
            consultaBD.execute();
            JOptionPane.showMessageDialog(null,"Produto excluído com sucesso!");
            conectaBD.desconexao();
        } catch (SQLException ex) {
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao Excluir produto! \ncod. Erro: "+ex.toString());
        }
    }
    
    public void editarProduto(Produto produto){
        conectaBD.conexao();
        
        try {
            PreparedStatement consultaBD = conectaBD.conn.prepareStatement("UPDATE produto SET nome=?,codigo_revista=?,descricao=?,valor=?,"
                    + "unid_medida=?,quantidade_ml=?,fornecedor=?,ciclo_campanha=? WHERE id_produto=?");
            consultaBD.setString(1, produto.getNome());
            consultaBD.setString(2, produto.getCodigo_revista());
            consultaBD.setString(3, produto.getDescricao());
            consultaBD.setDouble(4, produto.getValor());
            consultaBD.setString(5, produto.getUnidade_medida());
            consultaBD.setInt(6, produto.getQuantidade_ml());
            consultaBD.setString(7, produto.getFornecedor());
            consultaBD.setString(8, produto.getCiclo_campanha());
            consultaBD.setInt(9, produto.getId_produto());
            consultaBD.execute();
            conectaBD.desconexao();
            JOptionPane.showMessageDialog(null,"Produto Editado com sucesso!");
            
        } catch (SQLException ex) {
            //Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Erro ao Editar produto! \ncod. Erro: "+ex.toString());
        }
        
    }
    public Produto pesquisarProdutoID(int id){
        conectaBD.conexao();
        Produto produto = new Produto();
        conectaBD.executaSQL("SELECT * FROM produto WHERE id_produto = "+id);
        try {
            conectaBD.rs.first();
            produto.setNome(conectaBD.rs.getString("nome"));
            produto.setId_produto(conectaBD.rs.getInt("id_produto"));
            produto.setDescricao(conectaBD.rs.getString("descricao"));
            produto.setCodigo_revista(conectaBD.rs.getString("codigo_revista"));
            produto.setFornecedor(conectaBD.rs.getString("fornecedor"));
            produto.setQuantidade_ml(conectaBD.rs.getInt("quantidade_ml"));
            produto.setUnidade_medida(conectaBD.rs.getString("unid_medida"));
            produto.setCiclo_campanha(conectaBD.rs.getString("ciclo_campanha"));
            produto.setValor(conectaBD.rs.getDouble("valor"));
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Falha ao pesquisar Produto por ID!");
            Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return produto;
    }
    public Produto pesquisarProduto(String nome){
        Produto prodPesq = new Produto();
        Boolean sucesso = false;
        conectaBD.conexao();
        try {
            conectaBD.executaSQL("SELECT * FROM produto WHERE nome LIKE '%"+nome+"%'");
            conectaBD.rs.first();
            do {
                prodPesq.setNome(conectaBD.rs.getString("nome"));
                prodPesq.setId_produto(conectaBD.rs.getInt("id_produto"));
                prodPesq.setDescricao(conectaBD.rs.getString("descricao"));
                prodPesq.setCodigo_revista(conectaBD.rs.getString("codigo_revista"));
                prodPesq.setFornecedor(conectaBD.rs.getString("fornecedor"));
                prodPesq.setQuantidade_ml(conectaBD.rs.getInt("quantidade_ml"));
                prodPesq.setUnidade_medida(conectaBD.rs.getString("unid_medida"));
                prodPesq.setCiclo_campanha(conectaBD.rs.getString("ciclo_campanha"));
                prodPesq.setValor(conectaBD.rs.getDouble("valor"));
            } while(conectaBD.rs.next());
            sucesso = true;
        } catch (SQLException ex) {
            //Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Nome do produto não encontrado.");
            sucesso = false;
        }
        if(sucesso)
            return prodPesq;
        else
            return new Produto();
    }
    
    public DefaultTableModel pesquisarTodos(){
        DefaultTableModel tabela = new DefaultTableModel();
        tabela.setColumnIdentifiers(new String[]{"ID","Nome","Cod. Revista","Fornecedor","Valor","Descrição"});
        conectaBD.conexao();
        try {
            conectaBD.executaSQL("SELECT * FROM produto");
            conectaBD.rs.first();
            do{
                Object dados[] = {conectaBD.rs.getInt("id_produto"),conectaBD.rs.getString("nome"),conectaBD.rs.getString("codigo_revista"),conectaBD.rs.getString("fornecedor"),conectaBD.rs.getDouble("valor"),conectaBD.rs.getString("descricao")};
                tabela.addRow(dados);
            } while(conectaBD.rs.next()) ;
        } catch (SQLException ex) {
            //Logger.getLogger(ProdutoDAO.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null,"Não há produtos cadastrados!");
            return new DefaultTableModel();
        }
        return tabela;
    }
}
