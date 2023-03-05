/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

import java.util.Date;

/**
 *
 * @author leona
 */
public class Usuario extends Pessoa {
    
   
    private String senha;
    private String nivelAcesso;

    public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String cpf, String senha, String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, cpf);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(int id, String nome, String senha, String nivelAcesso) {
        super(id, nome);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

    public Usuario(int id, String senha, String nome) {
        super(id, nome);
        this.senha = senha;
    }
    
    

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNivelAcesso() {
        return nivelAcesso;
    }

    public void setNivelAcesso(String nivelAcesso) {
        this.nivelAcesso = nivelAcesso;
    }
    
    
    

 
    
}
    

   

    