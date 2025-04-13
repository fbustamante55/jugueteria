/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fabia
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = System.getenv("DB_URL"); // URL de la base de datos
    private static final String USER = System.getenv("DB_USER"); // Usuario de la base de datos
    private static final String PASS = System.getenv("DB_PASS"); // Contraseña de la base de datos

    public static Connection conectar() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASS);
        } catch (SQLException e) {
            System.err.println("Error de conexión: " + e.getMessage());
        } catch (ClassNotFoundException e) {
            System.err.println("Driver no encontrado: " + e.getMessage());
        }
        return conn;
    }
}
