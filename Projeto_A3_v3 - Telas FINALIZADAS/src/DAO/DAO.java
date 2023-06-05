/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

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
        
        String sql = "select * from tb_usuario where email = ? and senha = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){ //Ida
            
            ps.setString(1, objUsuario.getEmail());
            ps.setString(2, objUsuario.getSenha());
            
            try (ResultSet rs = ps.executeQuery()){
                
                return rs.next();
                
            }
            
        }
        
    }
    
    public void apontaUsuario(Usuario objUsuario, String id) throws Exception{
        
        String sql = "select * from tb_usuario where id = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){ //Ida
            
            ps.setString(1, String.valueOf(objUsuario.getId()));
            
            try {
                
                ResultSet rs = ps.executeQuery();
                while(rs.next()){
                    objUsuario.setId(Integer.parseInt(rs.getString("id")));
                    objUsuario.setNewData(rs.getString("new_data"));
                    objUsuario.setNome(rs.getString("nome"));
                    objUsuario.setNomeEmp(rs.getString("nome_emp"));
                    objUsuario.setEmail(rs.getString("email"));
                    objUsuario.setEndereco(rs.getString("endereco"));
                    objUsuario.setEnderecoEmp(rs.getString("endereco_emp"));
                    objUsuario.setCpf(rs.getString("cpf"));
                    objUsuario.setCnpj(rs.getString("cnpj"));
                    objUsuario.setBairro(rs.getString("bairro"));
                    objUsuario.setBairroEmp(rs.getString("bairro_emp"));
                    objUsuario.setCelCome(rs.getString("cel_come"));
                    objUsuario.setCelResi(rs.getString("cel_resi"));
                    objUsuario.setCelEmp(rs.getString("cel_emp"));
                    objUsuario.setCep(rs.getString("cep"));
                    objUsuario.setCepEmp(rs.getString("cep_emp"));
                    objUsuario.setCidade(rs.getString("cidade_emp"));
                    objUsuario.setCidadeEmp(rs.getString("cidade"));
                    objUsuario.setCnpjEmp(rs.getString("cnpj_emp"));
                    objUsuario.setComple(rs.getString("comple"));
                    objUsuario.setCompleEmp(rs.getString("comp_emp"));
                    objUsuario.setEmailEmp(rs.getString("email_emp"));
                    objUsuario.setTelEmp(rs.getString("tel_emp"));
                    objUsuario.setTelResi(rs.getString("tel_resi"));
                    objUsuario.setTelCome(rs.getString("tel_come"));
                    objUsuario.setEstadoEmp(rs.getString("estado_emp"));
                    objUsuario.setEstado(rs.getString("estado"));
                    objUsuario.setArq(rs.getString("arq_emp"));
                }
                
                
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        }
        
    }
    
    public void alterarUsuario(Usuario objUsuario) throws Exception{
        
        String sql = "update tb_usuario set new_data = ?, nome = ?, email = ?, senha = ?, endereco = ?, cpf = ?, "
                + "cnpj = ?, bairro = ?, cidade = ?, estado = ?, cep = ?, tel_resi = ?, cel_resi = ?, "
                + "tel_come = ?, cel_come = ?, comple = ?, tipo_usuario = ?, bairro_emp = ?, cidade_emp = ?, "
                + "endereco_emp = ?, email_emp = ?, estado_emp = ?, cep_emp = ?, cnpj_emp = ?, tel_emp = ?, "
                + "cel_emp = ?, nome_emp = ?, comp_emp = ?, arq_emp = ? where id = ?";
        
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
            ps.setInt(17, objUsuario.getTipoUsuario());
            ps.setString(18, objUsuario.getBairroEmp());
            ps.setString(19, objUsuario.getCidadeEmp());
            ps.setString(20, objUsuario.getEnderecoEmp());
            ps.setString(21, objUsuario.getEmailEmp());
            ps.setString(22, objUsuario.getEstadoEmp());
            ps.setString(23, objUsuario.getCepEmp());
            ps.setString(24, objUsuario.getCnpjEmp());
            ps.setString(25, objUsuario.getTelEmp());
            ps.setString(26, objUsuario.getCelEmp());
            ps.setString(27, objUsuario.getNomeEmp());
            ps.setString(28, objUsuario.getCompleEmp());
            ps.setString(29, objUsuario.getArq());
            ps.setInt(30, objUsuario.getId());
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        }
        
    }
    
    public void cadastrarUsuario(Usuario objUsuario) throws Exception{

        String sql = "insert into tb_usuario (new_data, nome, email, senha, endereco, cpf, cnpj, bairro, cidade, estado, cep, tel_resi, cel_resi, tel_come, cel_come, comple, tipo_usuario, "
                + "bairro_emp, cidade_emp, endereco_emp, email_emp, estado_emp, cep_emp, cnpj_emp, tel_emp, cel_emp, nome_emp, comp_emp, arq_emp) " 
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
         
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
            ps.setInt(17, objUsuario.getTipoUsuario());
            ps.setString(18, objUsuario.getBairroEmp());
            ps.setString(19, objUsuario.getCidadeEmp());
            ps.setString(20, objUsuario.getEnderecoEmp());
            ps.setString(21, objUsuario.getEmailEmp());
            ps.setString(22, objUsuario.getEstadoEmp());
            ps.setString(23, objUsuario.getCepEmp());
            ps.setString(24, objUsuario.getCnpjEmp());
            ps.setString(25, objUsuario.getTelEmp());
            ps.setString(26, objUsuario.getCelEmp());
            ps.setString(27, objUsuario.getNomeEmp());
            ps.setString(28, objUsuario.getCompleEmp());
            ps.setString(29, objUsuario.getArq());
            
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        } 
        
    }
    
    public void consultaUsuario(Usuario objUsuario, JTable table, String txtSql) throws Exception{
        
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
               i++;
            }
            
        }
        
    }
    
}
