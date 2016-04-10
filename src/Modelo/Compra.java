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
public class Compra {
    public int codigo_compra;
    public String status_compra;
    public String entrega_cliente;
    public int id_produto;
    public int id_revendedor;
    public int id_cliente;

    public int getCodigo_compra() {
        return codigo_compra;
    }

    public void setCodigo_compra(int codigo_compra) {
        this.codigo_compra = codigo_compra;
    }

    public String getStatus_compra() {
        return status_compra;
    }

    public void setStatus_compra(String status_compra) {
        this.status_compra = status_compra;
    }

    public String getEntrega_cliente() {
        return entrega_cliente;
    }

    public void setEntrega_cliente(String entrega_cliente) {
        this.entrega_cliente = entrega_cliente;
    }

    public int getId_produto() {
        return id_produto;
    }

    public void setId_produto(int id_produto) {
        this.id_produto = id_produto;
    }

    public int getId_revendedor() {
        return id_revendedor;
    }

    public void setId_revendedor(int id_revendedor) {
        this.id_revendedor = id_revendedor;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }
    
    
    
}
