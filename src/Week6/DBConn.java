package Week6;

import java.sql.*;

public class DBConn {
    public static final String DB_URL = "jdbc:mysql://localhost/university";
    public static final String DB_USER = "root";
    public static final String DB_PASSWORD = "your_password";

    public static void main(String[] args) {
        Connection connect = null;

        // kayıt silme
        String stSql = "DELETE FROM student WHERE student_id = 4";
        String prSql = "DELETE FROM student WHERE student_id = ?";

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            st.executeUpdate(stSql);

            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setInt(1,3);
            pr.executeUpdate();

            st.close();
            connect.close();
            pr.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }

        // kayıt güncelleme
        /*String stSql = "UPDATE student SET student_name = 'Mahmut' WHERE student_id = 1";
        String prSql = "UPDATE student SET student_name = ? WHERE student_id = ?";

        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            //Statement st = connect.createStatement();
            //st.executeUpdate(stSql);

            PreparedStatement pr = connect.prepareStatement(prSql);
            pr.setString(1,"Ayla");
            pr.setInt(2,1);
            pr.executeUpdate();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/



        // Prepared Statement ile kayıt ekleme
        /*String prSql = " INSERT INTO student(student_name, student_class) VALUES (?,?)";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            PreparedStatement prSt= connect.prepareStatement(prSql);
            prSt.setString(1,"Ahmet Gezen");
            prSt.setInt(2,1);
            prSt.executeUpdate();
            prSt.close();

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/




        // Statement ile kayıt ekleme
        /*String insertSql = " INSERT INTO student(student_name, student_class) VALUES ('Fatih Uçar',2)";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement();
            System.out.println(st.executeUpdate(insertSql));

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/



        // executeQuery - kayıt çekme
        /*String sql = "SELECT * FROM student";
        try {
            connect = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            Statement st = connect.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
            ResultSet data = st.executeQuery(sql);
            while(data.next()){
                System.out.println("ID: " + data.getInt("student_id"));
                System.out.println("Name: " + data.getString("student_name"));
                System.out.println("Class: " + data.getInt("student_class"));
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }*/
    }
}
