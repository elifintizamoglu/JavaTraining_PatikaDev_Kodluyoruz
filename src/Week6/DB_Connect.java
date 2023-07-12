package Week6;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DB_Connect {
    public static void main(String[] args) {
        Connection connect = null;
        String url = "jdbc:mysql://localhost/university?user=root&password=your_password";

        try{
            connect = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
