package Base_de_Datos;
//@Autor Cesar
import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    //Autenticacion por windows
    private static final String URL =
        "jdbc:sqlserver://localhost:1433;"
      + "databaseName=Biblioteca;"
      + "integratedSecurity=true;"
      + "encrypt=false;";

    public static Connection getConnection() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            return DriverManager.getConnection(URL);
        } catch (Exception e) {
            System.out.println("Error al conectar a SQL Server");
            e.printStackTrace();
            return null;
        }
    }
}
