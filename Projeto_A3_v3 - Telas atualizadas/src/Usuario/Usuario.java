/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Felipe
 */
public class Usuario {
    
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telResi;
    private String telCome;
    private String celResi;
    private String celCome;
    private String comple;
    private int tipoUsuario;

    public Usuario(String nome, String email, String senha, String endereco, String bairro, String cidade, 
            String estado, String cep, String telResi, String telCome, String celResi, String celCome, 
            String comple, int tipoUsuario) { //Construtor do usuario:
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.telResi = telResi;
        this.telCome = telCome;
        this.celResi = celResi;
        this.celCome = celCome;
        this.comple = comple;
        this.tipoUsuario = tipoUsuario;
    }

    public String getNome() { //get do nome
        return nome;
    }

    public String getSenha() { //get da senha
        return senha;
    }
    
    public String getEmail() { //get do nome
        return email;
    }

    public String getEndereco() { //get da senha
        return endereco;
    }
    
    public String getBairro() { //get do nome
        return bairro;
    }

    public String getCidade() { //get da senha
        return cidade;
    }
    
    public String getEstado() { //get do nome
        return estado;
    }

    public String getCep() { //get da senha
        return cep;
    }
    
    public String getTelResi() { //get do nome
        return telResi;
    }

    public String getTelCome() { //get da senha
        return telCome;
    }
    
    public String getCelResi() { //get do nome
        return celResi;
    }

    public String getCelCome() { //get da senha
        return celCome;
    }
    
    public String getComple() { //get da senha
        return comple;
    }
    
    public int getTipoUsuario() { //get da senha
        return tipoUsuario;
    }
    
    public void setNome(String nome) { //set do nome
        this.nome = nome;
    }

    public void setSenha(String senha) {//set da senha
        this.senha = senha;
    }
    
    public void setEmail(String email) { //set do nome
        this.email = email;
    }

    public void setEndereco(String endereco) {//set da senha
        this.endereco = endereco;
    }
    
    public void setBairro(String bairro) { //set do nome
        this.bairro = bairro;
    }

    public void setCidade(String cidade) {//set da senha
        this.cidade = cidade;
    }
    
    public void setEstado(String estado) { //set do nome
        this.estado = estado;
    }

    public void setCep(String cep) {//set da senha
        this.cep = cep;
    }
    
    public void setTelResi(String telResi) {//set da senha
        this.telResi = telResi;
    }
    
    public void setTelCome(String telCome) { //set do nome
        this.telCome = telCome;
    }

    public void setCelResi(String celResi) {//set da senha
        this.celResi = celResi;
    }
    
    public void setCelCome(String celCome) {//set da senha
        this.celCome = celCome;
    }
    
    public void setComple(String comple) { //set do nome
        this.comple = comple;
    }

    public void setTipoUsuario(int tipoUsuario) {//set da senha
        this.tipoUsuario = tipoUsuario;
    }
    
}
