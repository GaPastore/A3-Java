
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Felipe
 */
public class DAO { //Data acess to Object (fazer a ponte com o MySQL)
    
    public boolean existeUsuario(Usuario usuario) throws Exception{
        
        String sql = "select * from tb_usuario where nome = ? and senha = ?";
        
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){ //Ida
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getSenha());
            
            try (ResultSet rs = ps.executeQuery()){
                return rs.next();
                
            }
            
        }
        
    }
    
     public boolean cadastrarUsuario(Usuario objUsuario) throws Exception{

        String sql = "insert into usuario (nomeUsuario, senhaUsuario) values (?, ?)";
         
        try (Connection conn = ConnectionFactory.obtemConexao(); PreparedStatement ps = conn.prepareStatement(sql)){
            
            ps.setString(1, objUsuario.getNome());
            ps.setString(2, objUsuario.getSenha());
            
            try (ResultSet rs = ps.executeQuery()){
                return rs.next();
                
            }
            
        } 
        
    }
    
}
