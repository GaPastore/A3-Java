/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Usuario.Empresa;
import Usuario.Usuario;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Felipe
 */
public class DAO {
    
    public boolean existeUsuario(Usuario objUsuario) throws Exception{
        
        String sql = "select * from tb_usuario where tipo_usuario = 1 and email = ? and senha = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){ //Ida
            
            ps.setString(1, objUsuario.getEmail());
            ps.setString(2, objUsuario.getSenha());
            
            try (ResultSet rs = ps.executeQuery()){
                
                return rs.next();
                
            }
            
        }
        
    }
    
    public void apontaUsuario(Usuario objUsuario, Empresa objEmpresa, String id) throws Exception{
        
        String sql = "select * from tb_usuario where tipo_usuario = 2 and id = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){ //Ida
            
            ps.setString(1, String.valueOf(objUsuario.getId()));
            
            try {
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    objUsuario.setId(rs.getString("id"));
                    objUsuario.setNewData(rs.getString("new_data"));
                    objUsuario.setNome(rs.getString("nome"));
                    objEmpresa.setNomeEmp(rs.getString("nome_emp"));
                    objUsuario.setEmail(rs.getString("email"));
                    objUsuario.setEndereco(rs.getString("endereco"));
                    objEmpresa.setEnderecoEmp(rs.getString("endereco_emp"));
                    objUsuario.setCpf(rs.getString("cpf"));
                    objUsuario.setCnpj(rs.getString("cnpj"));
                    objUsuario.setBairro(rs.getString("bairro"));
                    objEmpresa.setBairroEmp(rs.getString("bairro_emp"));
                    objUsuario.setCelCome(rs.getString("cel_come"));
                    objUsuario.setCelResi(rs.getString("cel_resi"));
                    objEmpresa.setCelEmp(rs.getString("cel_emp"));
                    objUsuario.setCep(rs.getString("cep"));
                    objEmpresa.setCepEmp(rs.getString("cep_emp"));
                    objUsuario.setCidade(rs.getString("cidade_emp"));
                    objEmpresa.setCidadeEmp(rs.getString("cidade"));
                    objEmpresa.setCnpjEmp(rs.getString("cnpj_emp"));
                    objUsuario.setComple(rs.getString("comple"));
                    objEmpresa.setCompleEmp(rs.getString("comp_emp"));
                    objEmpresa.setEmailEmp(rs.getString("email_emp"));
                    objEmpresa.setTelEmp(rs.getString("tel_emp"));
                    objUsuario.setTelResi(rs.getString("tel_resi"));
                    objUsuario.setTelCome(rs.getString("tel_come"));
                    objEmpresa.setEstadoEmp(rs.getString("estado_emp"));
                    objUsuario.setEstado(rs.getString("estado"));
                    objEmpresa.setArq(rs.getString("arq_emp"));
                    objUsuario.setAprovado(rs.getString("aprovado"));
                }
                
                
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        }
        
    }
    
    public void alterarUsuario(Usuario objUsuario) throws Exception{
        
        String sql = "update tb_usuario set new_data = ?, nome = ?, email = ?, senha = ?, endereco = ?, cpf = ?, "
                + "cnpj = ?, bairro = ?, cidade = ?, estado = ?, cep = ?, tel_resi = ?, cel_resi = ?, "
                + "tel_come = ?, cel_come = ?, comple = ?, tipo_usuario = ?, aprovado = ? where id = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objUsuario.getNewData());
            ps.setString(2, objUsuario.getNome());
            ps.setString(3, objUsuario.getEmail());
            ps.setString(4, objUsuario.getSenha());
            ps.setString(5, objUsuario.getEndereco());
            ps.setString(6, objUsuario.getCpf());
            ps.setString(7, objUsuario.getCnpj());
            ps.setString(8, objUsuario.getBairro());
            ps.setString(9, objUsuario.getCidade());
            ps.setString(10, objUsuario.getEstado());
            ps.setString(11, objUsuario.getCep());
            ps.setString(12, objUsuario.getTelResi());
            ps.setString(13, objUsuario.getTelCome());
            ps.setString(14, objUsuario.getCelResi());
            ps.setString(15, objUsuario.getCelCome());
            ps.setString(16, objUsuario.getComple());
            ps.setString(17, objUsuario.getTipoUsuario());
            ps.setString(30, objUsuario.getAprovado());
            ps.setString(31, objUsuario.getId());
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        }
        
    }
    
    public void alterarSenha(Usuario objUsuario) throws Exception{
        
        String sql = "update tb_usuario set senha = ? where nome = ? and email = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objUsuario.getSenha());
            ps.setString(2, objUsuario.getNome());
            ps.setString(3, objUsuario.getEmail());
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        }
        
    }
    
    public void alterarEmpresa(Empresa objEmpresa, Usuario objUsuario) throws Exception{

        String sql = "update tb_usuario set bairro_emp = ?, cidade_emp = ?, endereco_emp = ?, email_emp = ?, estado_emp = ?, "
                + "cep_emp = ?, cnpj_emp = ?, tel_emp = ?, cel_emp = ?, nome_emp = ?, comple_emp = ?, arq_emp = ?"
                + " where id_usuario = ?";
         
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objEmpresa.getBairroEmp());
            ps.setString(2, objEmpresa.getCidadeEmp());
            ps.setString(3, objEmpresa.getEnderecoEmp());
            ps.setString(4, objEmpresa.getEmailEmp());
            ps.setString(5, objEmpresa.getEstadoEmp());
            ps.setString(6, objEmpresa.getCepEmp());
            ps.setString(7, objEmpresa.getCnpjEmp());
            ps.setString(8, objEmpresa.getTelEmp());
            ps.setString(9, objEmpresa.getCelEmp());
            ps.setString(10, objEmpresa.getNomeEmp());
            ps.setString(11, objEmpresa.getCompleEmp());
            ps.setString(12, objUsuario.getId());
            
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        } 
        
    }
    
    public void excluirUsuario(Usuario objUsuario) throws Exception{
        
        String sql = "delete from tb_usuario where id = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objUsuario.getId());
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        }
        
    }
    
    public void excluirEmpresa(Usuario objUsuario) throws Exception{
        
        String sql = "delete from tb_empresa where id_usario = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objUsuario.getId());
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        }
        
    }
    
    public void cadastrarUsuario(Usuario objUsuario) throws Exception{

        String sql = "insert into tb_usuario (new_data, nome, email, senha, endereco, cpf, cnpj, bairro, cidade, estado, cep, tel_resi, cel_resi, tel_come, cel_come, comple, tipo_usuario, aprovado) " 
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
         
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objUsuario.getNewData());
            ps.setString(2, objUsuario.getNome());
            ps.setString(3, objUsuario.getEmail());
            ps.setString(4, objUsuario.getSenha());
            ps.setString(5, objUsuario.getEndereco());
            ps.setString(6, objUsuario.getCpf());
            ps.setString(7, objUsuario.getCnpj());
            ps.setString(8, objUsuario.getBairro());
            ps.setString(9, objUsuario.getCidade());
            ps.setString(10, objUsuario.getEstado());
            ps.setString(11, objUsuario.getCep());
            ps.setString(12, objUsuario.getTelResi());
            ps.setString(13, objUsuario.getTelCome());
            ps.setString(14, objUsuario.getCelResi());
            ps.setString(15, objUsuario.getCelCome());
            ps.setString(16, objUsuario.getComple());
            ps.setString(17, objUsuario.getTipoUsuario());
            ps.setString(18, objUsuario.getAprovado());
            
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        } 
        
    }
    
    public void cadastrarEmpresa(Empresa objEmpresa) throws Exception{

        String sql = "insert into tb_empresa (bairro_emp, cidade_emp, endereco_emp, email_emp, estado_emp, cep_emp, cnpj_emp, tel_emp, cel_emp, nome_emp, comp_emp, arq_emp) " 
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
         
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objEmpresa.getBairroEmp());
            ps.setString(2, objEmpresa.getCidadeEmp());
            ps.setString(3, objEmpresa.getEnderecoEmp());
            ps.setString(4, objEmpresa.getEmailEmp());
            ps.setString(5, objEmpresa.getEstadoEmp());
            ps.setString(6, objEmpresa.getCepEmp());
            ps.setString(7, objEmpresa.getCnpjEmp());
            ps.setString(8, objEmpresa.getTelEmp());
            ps.setString(9, objEmpresa.getCelEmp());
            ps.setString(10, objEmpresa.getNomeEmp());
            ps.setString(11, objEmpresa.getCompleEmp());
            ps.setString(12, objEmpresa.getArq());
            
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        } 
        
    }
    
    public void cadastrarIdEmpresa(Usuario objUsuario) throws Exception{

        String sql = "insert into tb_empresa (id_usuario) " 
                + "select id from tb_usuario where nome = ?";
         
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objUsuario.getNome());
            
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        } 
        
    }
    
    public void consultaUsuario(JTable table, String txtSql) throws Exception{
        
        String sql = txtSql;
        
        try (Connection conn = ConnectionFactory.obtemConexao();){ //Ida
            
            
            DefaultTableModel dtm = (DefaultTableModel) table.getModel();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            
            for(int g = 0; g > dtm.getRowCount(); g++){
                
                dtm.removeRow(g);
            }
            
            int i = 0;
            
            while(rs.next()){
               dtm.setRowCount(i+1);
               table.setValueAt(rs.getString("id"), i, 0);
               table.setValueAt(rs.getString("nome"), i, 1);
               table.setValueAt(rs.getString("nome_emp"), i, 2);
               table.setValueAt(rs.getString("email"), i, 3);
               table.setValueAt(rs.getString("cep"), i, 4);
               table.setValueAt(rs.getString("cnpj_emp"), i, 5);
               if(rs.getString("aprovado") == "1"){
                   table.setValueAt("Em Análise", i, 6);
               } else if(rs.getString("aprovado") == "2"){
                   table.setValueAt("Negado", i, 6);
               } else if(rs.getString("aprovado") == "3"){
                   table.setValueAt("Aprovado", i, 6);
               }
               i++;
            }
            
        }
        
    }
        
}
