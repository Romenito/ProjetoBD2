/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Romen
 */
public class Produto {
    private String nome_produto;
    private String descricao;
    private String codigo_revista;
    private String ciclo_campanha;
    private String fornecedor;
    private String unidade_medida;
    private int id_produto;
    private double valor;
    private int quantidade_ml;

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getCodigo_revista() {
        return codigo_revista;
    }

    public void setCodigo_revista(String codigo_revista) {
        this.codigo_revista = codigo_revista;
    }

    public String getCiclo_campanha() {
        return ciclo_campanha;
    }

    public void setCiclo_campanha(String ciclo_campanha) {
        this.ciclo_campanha = ciclo_campanha;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public String getUnidade_medida() {
        return unidade_medida;
    }

    public void setUnidade_medida(String unidade_medida) {
        this.unidade_medida = unidade_medida;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getQuantidade_ml() {
        return quantidade_ml;
    }

    public void setQuantidade_ml(int quantidade_ml) {
        this.quantidade_ml = quantidade_ml;
    }
    
    
    
}
