//Classe de conexão com o BD
package bancodedados;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Snowgal
 */
public class Conectar {

    private static Connection conn;
    private static final String driver = "com.mysql.jdbc.Driver";
    private static final String user = "root";
    private static final String password = "";
    private static final String url = "jdbc:mysql://localhost:3306/clinica";

    public Conectar() {
        conn = null;
        try {
            Class.forName(driver);
            conn = (Connection) DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conexão estabelecida");
            }
        } catch (Exception e) {
            System.out.println("Error ao conectar" + e);
        }

    }
    //Esse método retorna a conexão
    public Connection getConnection(){
        return conn;
    }
    
    //Método para desconectar do BD
    public void desconectar(){
        conn =null;
        if(conn==null){
            System.out.println("Desconectado");
        }
    }

}
