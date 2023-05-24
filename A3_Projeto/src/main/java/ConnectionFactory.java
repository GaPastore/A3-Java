
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
    
    private static String host = "localhost";
    private static String porta = "3306";
    private static String db = "db_sistema_cadastro";
    private static String usuario = "root";
    private static String senha = "123456";
    
    public static Connection obtemConexao () throws Exception {
        String url = String.format("\"jdbc:mysql://%s:%s/%s?useTimezone=true&serverTimezone=UTC\"", host, porta, db);
        
        return DriverManager.getConnection(url, usuario, senha);
        
    }
    
}
