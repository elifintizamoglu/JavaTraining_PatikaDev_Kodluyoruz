package Week6;

import java.sql.*;

public class DBConn_Transaction {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        Connection connect = null;

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            connect.setAutoCommit(false); //db işlemlerini hafızaya alır
            PreparedStatement pr = connect.prepareStatement("INSERT INTO student (student_name, student_class) VALUES (?,?)");
            pr.setString(1,"Fatma");
            pr.setInt(2,2);
            pr.executeUpdate();

            if(true){
                throw new SQLException();
            }

            pr.setString(1,"Faruk");
            pr.setInt(2,3);
            pr.executeUpdate();

            connect.commit(); // commit edilince işlemleri çalıştırır ve dbde değişiklik yapar
            pr.close();
            connect.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
