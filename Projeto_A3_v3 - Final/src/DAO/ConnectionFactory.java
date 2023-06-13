/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Felipe
 */
public class ConnectionFactory {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_sistema_cadastro";
    private static String usuario = "root";
    private static String senha = "123456";
    
    public static Connection obtemConexao () throws Exception {
        String url = String.format("jdbc:mysql://%s:%s/%s?allowMultiQueries=true&useTimezone=true&serverTimezone=UTC", host, porta, db);
        
        return DriverManager.getConnection(url, usuario, senha);
        }
    
}
