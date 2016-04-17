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
    public String nome;
    public String descricao;
    public String codigo_revista;
    public String ciclo_campanha;
    public String fornecedor;
    public String unidade_medida;
    public int id_produto;
    public double valor;
    public int quantidade_ml;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
