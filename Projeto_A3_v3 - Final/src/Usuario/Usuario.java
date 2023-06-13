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
    
    private int id;
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
    private int tipoUsuario;
    private String nomeEmp;
    private String emailEmp;
    private String cnpjEmp;
    private String bairroEmp;
    private String enderecoEmp;
    private String cidadeEmp;
    private String estadoEmp;
    private String cepEmp;
    private String telEmp;
    private String celEmp;
    private String compleEmp;
    private String arqEmp;
    private int aprovado;

    public Usuario(int id, String newData, String nome, String email, String senha, String endereco, String cpf, String cnpj, String bairro, String cidade, 
            String estado, String cep, String telResi, String telCome, String celResi, String celCome, 
            String comple, int tipoUsuario, String nomeEmp, String emailEmp, String cnpjEmp, String enderecoEmp, String bairroEmp, String cidadeEmp, String estadoEmp, String cepEmp, 
            String telEmp, String celEmp, String compleEmp, String arqEmp, int aprovado) { //Construtor do usuario:
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
        this.telResi = telResi;
        this.telCome = telCome;
        this.celResi = celResi;
        this.celCome = celCome;
        this.comple = comple;
        this.tipoUsuario = tipoUsuario;
        this.nomeEmp = nomeEmp;
        this.cnpjEmp = cnpjEmp;
        this.emailEmp = emailEmp;
        this.enderecoEmp = enderecoEmp;
        this.bairroEmp = bairroEmp;
        this.cidadeEmp = cidadeEmp;
        this.estadoEmp = estadoEmp;
        this.cepEmp = cepEmp;
        this.telEmp = telEmp;
        this.celEmp = celEmp;
        this.compleEmp = compleEmp;
        this.arqEmp = arqEmp;
        this.aprovado = aprovado;
    }

    public Usuario(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public int getId(){
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
    
    public int getTipoUsuario() { //get da senha
        return tipoUsuario;
    }
    
    public int getAprovado() { //get da senha
        return aprovado;
    }
    
    public void setId(int id){
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

    public void setTipoUsuario(int tipoUsuario) {//set da senha
        this.tipoUsuario = tipoUsuario;
    }
    
    public void setAprovado(int aprovado) {//set da senha
        this.aprovado = aprovado;
    }

    public String getNomeEmp() { //get do nome
        return nomeEmp;
    }

    public String getCnpjEmp() { //get da senha
        return cnpjEmp;
    }
    
    public String getBairroEmp() { //get do nome
        return bairroEmp;
    }

    public String getCidadeEmp() { //get da senha
        return cidadeEmp;
    }
    
    public String getEmailEmp() { //get da senha
        return emailEmp;
    }
    
    public String getEstadoEmp() { //get do nome
        return estadoEmp;
    }

    public String getCepEmp() { //get da senha
        return cepEmp;
    }
    
    public String getEnderecoEmp() { //get da senha
        return enderecoEmp;
    }
    
    public String getTelEmp() { //get do nome
        return telEmp;
    }
    
    public String getCelEmp() { //get do nome
        return celEmp;
    }
    
    public String getArq() { //get do nome
        return arqEmp;
    }
    
    public String getCompleEmp() { //get da senha
        return compleEmp;
    }
    
    public void setNomeEmp(String nome) { //set do nome
        this.nomeEmp = nome;
    }

    public void setCnpjEmp(String cnpjEmp) {//set da senha
        this.cnpjEmp = cnpjEmp;
    }
    
    public void setEnderecoEmp(String enderecoEmp) {//set da senha
        this.enderecoEmp = enderecoEmp;
    }
    
    public void setBairroEmp(String bairro) { //set do nome
        this.bairroEmp = bairro;
    }

    public void setCidadeEmp(String cidade) {//set da senha
        this.cidadeEmp = cidade;
    }
    
    public void setEmailEmp(String emailEmp) {//set da senha
        this.emailEmp = emailEmp;
    }
    
    public void setEstadoEmp(String estado) { //set do nome
        this.estadoEmp = estado;
    }

    public void setCepEmp(String cep) {//set da senha
        this.cepEmp = cep;
    }
    
    public void setTelEmp(String telResi) {//set da senha
        this.telEmp = telResi;
    }

    public void setCelEmp(String celResi) {//set da senha
        this.celEmp = celResi;
    }
    
    public void setArq(String arqEmp) {//set da senha
        this.arqEmp = arqEmp;
    }
    
    public void setCompleEmp(String comple) { //set do nome
        this.compleEmp = comple;
    }
    
}
