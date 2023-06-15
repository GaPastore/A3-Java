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
    
    private String id;
    private String newData;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String cpf;
    private String cnpj;
    private String bairro;
    private String cidade;
    private String estado;
    private String cep;
    private String telResi;
    private String telCome;
    private String celResi;
    private String celCome;
    private String comple;
    private String tipoUsuario;
    private String aprovado;

    public Usuario(String id, String newData, String nome, String email, String senha, String endereco, String cpf, String cnpj, String bairro, String cidade, 
            String estado, String cep, String telResi, String telCome, String celResi, String celCome, 
            String comple, String tipoUsuario, String aprovado) { //Construtor do usuario:
        this.id = id;
        this.newData = newData;
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.cpf = cpf;
        this.cnpj = cnpj;
        this.bairro = bairro;
        this.cidade = cidade;
        this.estado = estado;
        this.cep = cep;
        this.tipoUsuario = tipoUsuario;
        this.aprovado = aprovado;
        this.telCome = telCome;
        this.celCome = celCome;
        this.telResi = telResi;
        this.celResi = celResi;
        this.comple = comple;
    }

    public Usuario(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getId(){
        return id;
    }
    
    public String getNewData() { //get do nome
        return newData;
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
    
    public String getCpf() { //get da senha
        return cpf;
    }
    
    public String getCnpj() { //get da senha
        return cnpj;
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
    
    public String getTipoUsuario() { //get da senha
        return tipoUsuario;
    }
    
    public String getAprovado() { //get da senha
        return aprovado;
    }
    
    public void setId(String id){
        this.id = id;
    }
    
    public void setNewData(String newData) { //set do nome
        this.newData = newData;
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
    
    public void setCpf(String cpf) {//set da senha
        this.cpf = cpf;
    }
    
    public void setCnpj(String cnpj) {//set da senha
        this.cnpj = cnpj;
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

    public void setTipoUsuario(String tipoUsuario) {//set da senha
        this.tipoUsuario = tipoUsuario;
    }
    
    public void setAprovado(String aprovado) {//set da senha
        this.aprovado = aprovado;
    }
    
}
