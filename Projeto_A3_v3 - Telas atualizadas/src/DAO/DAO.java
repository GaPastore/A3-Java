/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Usuario.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

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
    
    public void cadastrarUsuario(Usuario objUsuario) throws Exception{

        String sql = "insert into tb_usuario (nome, email, senha, endereco, bairro, cidade, estado, cep, tel_resi, cel_resi, tel_come, cel_come, comple, tipo_usuario) "
                + "values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
         
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objUsuario.getNome());
            ps.setString(2, objUsuario.getEmail());
            ps.setString(3, objUsuario.getSenha());
            ps.setString(4, objUsuario.getEndereco());
            ps.setString(5, objUsuario.getBairro());
            ps.setString(6, objUsuario.getCidade());
            ps.setString(7, objUsuario.getEstado());
            ps.setString(8, objUsuario.getCep());
            ps.setString(9, objUsuario.getTelResi());
            ps.setString(10, objUsuario.getTelCome());
            ps.setString(11, objUsuario.getCelResi());
            ps.setString(12, objUsuario.getCelCome());
            ps.setString(13, objUsuario.getComple());
            ps.setInt(14, objUsuario.getTipoUsuario());
            
            
            try {
                
                int rs = ps.executeUpdate();
                
            } catch (Exception e){
                
                e.printStackTrace();
            
            }
            
        } 
        
    }
    
    public boolean consultaUsuario(Usuario objUsuario) throws Exception{
        
        String sql = "select * from tb_usuario where nome = ? or cep = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){ //Ida
            
            ps.setString(1, objUsuario.getNome());
            ps.setString(2, objUsuario.getCep());
            
            try (ResultSet rs = ps.executeQuery()){
               
                return rs.next();
                
            }
            
        }
        
    }
    
}
