package programa;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ProgramaPrincipal {
	public static void main(String[] args) throws SQLException {
		AccesoBD accBD = new AccesoBD("src/main/resources/bdProperties.properties");
		accBD.conectar();
		accBD.desconectar();
	}
}
