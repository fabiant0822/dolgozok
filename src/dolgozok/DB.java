package dolgozok;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Fabian Tamas 1.0
 */
public class DB {
    Connection kapcs;
    PreparedStatement ekpar;
    ResultSet eredmeny;
    
    final String dbUrl = "jdbc:mysql://localhost:3306/"
            + "?useUnicode = true&characterEncoding = UTF-8";
    final String user = "root";
    final String pass = "";
    
    public DB() {
        try {
            // kapcsolat létrehozása
            kapcs = DriverManager.getConnection(dbUrl, user, pass);
            System.out.println("A kapcsolat létrejött.");
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }
}

