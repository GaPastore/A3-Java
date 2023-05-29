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
    
    private String nomeEmp;
    private String cnpjEmp;
    private String bairroEmp;
    private String cidadeEmp;
    private String estadoEmp;
    private String cepEmp;
    private String telEmp;
    private String celEmp;
    private String compleEmp;

    public Empresa(String nomeEmp, String cnpjEmp, String bairroEmp, String cidadeEmp, String estadoEmp, String cepEmp, 
            String telEmp, String celEmp, String compleEmp) { //Construtor do usuario:
        this.nomeEmp = nomeEmp;
        this.cnpjEmp = cnpjEmp;
        this.bairroEmp = bairroEmp;
        this.cidadeEmp = cidadeEmp;
        this.estadoEmp = estadoEmp;
        this.cepEmp = cepEmp;
        this.telEmp = telEmp;
        this.celEmp = celEmp;
        this.compleEmp = compleEmp;
    }

    public String getNome() { //get do nome
        return nomeEmp;
    }

    public String getCnpj() { //get da senha
        return cnpjEmp;
    }
    
    public String getBairro() { //get do nome
        return bairroEmp;
    }

    public String getCidade() { //get da senha
        return cidadeEmp;
    }
    
    public String getEstado() { //get do nome
        return estadoEmp;
    }

    public String getCep() { //get da senha
        return cepEmp;
    }
    
    public String getTel() { //get do nome
        return telEmp;
    }
    
    public String getCel() { //get do nome
        return celEmp;
    }
    
    public String getComple() { //get da senha
        return compleEmp;
    }
    
    public void setNome(String nome) { //set do nome
        this.nomeEmp = nome;
    }

    public void setCnpj(String senha) {//set da senha
        this.cnpjEmp = senha;
    }
    
    public void setBairro(String bairro) { //set do nome
        this.bairroEmp = bairro;
    }

    public void setCidade(String cidade) {//set da senha
        this.cidadeEmp = cidade;
    }
    
    public void setEstado(String estado) { //set do nome
        this.estadoEmp = estado;
    }

    public void setCep(String cep) {//set da senha
        this.cepEmp = cep;
    }
    
    public void setTel(String telResi) {//set da senha
        this.telEmp = telResi;
    }

    public void setCel(String celResi) {//set da senha
        this.celEmp = celResi;
    }
    
    public void setComple(String comple) { //set do nome
        this.compleEmp = comple;
    }
    
}
