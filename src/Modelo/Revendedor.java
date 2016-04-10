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
public class Revendedor {
    public String nome;
    public String sobrenome;
    public String cpf_revendedor;
    public String email;
    public int id_revendedor;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getCpf_revendedor() {
        return cpf_revendedor;
    }

    public void setCpf_revendedor(String cpf_revendedor) {
        this.cpf_revendedor = cpf_revendedor;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_revendedor() {
        return id_revendedor;
    }

    public void setId_revendedor(int id_revendedor) {
        this.id_revendedor = id_revendedor;
    }
    
    
    
    
}
