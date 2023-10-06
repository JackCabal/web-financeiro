package connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public Connection getConnection() throws SQLException {
        String url = "jdbc:sqlserver://DESKTOP-MR8C30C:1433;databaseName=ControleFinanceiro;";
        String usuario = "sa";
        String senha = "1234";
        Connection conexao = DriverManager.getConnection(url, usuario, senha);
        return conexao;
        
    }
}
