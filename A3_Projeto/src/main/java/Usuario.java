/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public class Usuario {
    
    private String nome;
    private String senha;

    public Usuario(String nome, String senha) { //Construtor do usuario:
        this.nome = nome;
        this.senha = senha;
    }
    
    public String getNome() { //get do nome
        return nome;
    }

    public String getSenha() { //get do senha
        return senha;
    }
    
    public void setNome(String nome) { //set do nome
        this.nome = nome;
    }

    public void setSenha(String senha) {//set do senha
        this.senha = senha;
    }
    
}
