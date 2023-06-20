/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Usuario;

/**
 *
 * @author Felipe
 */
public class Empresa {
    
    private String idEmp;
    private String idCli;
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
    private String aprovado;

    public Empresa(String idEmp, String idCli, String nomeEmp, String emailEmp, String cnpjEmp, String enderecoEmp, String bairroEmp, String cidadeEmp, String estadoEmp, String cepEmp, 
            String telEmp, String celEmp, String compleEmp, String arqEmp, String aprovado) { //Construtor do usuario:
        this.idEmp = idEmp;
        this.idCli = idCli;
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

    public Empresa(String login, String senha) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    public String getIdEmp(){
        return idEmp;
    }
    
    public void setIdEmp(String idEmp){
        this.idEmp = idEmp;
    }
    
    public String getIdCli(){
        return idCli;
    }
    
    public void setIdCli(String idCli){
        this.idCli = idCli;
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
    
    public String getAprovado() { //get da senha
        return aprovado;
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
    
    public void setAprovado(String aprovado) {//set da senha
        this.aprovado = aprovado;
    }
    
}
