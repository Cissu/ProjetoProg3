//Classe de conexão com o BD
package bancodedados;

import java.sql.Connection;
//import com.sun.istack.internal.logging.Logger;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Snowgal
 */
public class Conectar {

    //private static Connection conn;
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String URL = "jdbc:mysql://localhost:3306/clinica";

    public static Connection getConnection() {
        try {
            Class.forName(DRIVER);
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na conexão: ", ex);
        }

    }
    //Esse método retorna a conexão
  //  public static Connection getfConnection(){
  //      return conn;
 //   }
    
    //Método para desconectar do BD
    public static void closeConnection(Connection conn){
        
        try {
            if(conn !=null){
                conn.close();
            }
        } catch (SQLException e) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, e);
        }
 
    }
    
    
    public static void closeConnection(Connection conn, PreparedStatement stmt){
        closeConnection(conn);
        
        if(stmt!=null){
            try {
                stmt.close();
            } catch (SQLException ex) {
                Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
        
        closeConnection(con, stmt);
        
            
            try {
                if(rs!=null){
                rs.close();
                }
            } catch (SQLException ex) {
                java.util.logging.Logger.getLogger(Conectar.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        
    }

}
