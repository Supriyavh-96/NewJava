package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCInsert {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_practice";
    String username = "root";
    String password = "YOUR_PASSWORD";
    String query = "INSERT INTO students (name,age,course)VALUES(?,?,?)";
    try(Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pst = con.prepareStatement(query)){
          pst.setString(1, "kiran");
          pst.setInt(2, 24);
          pst.setString(3, "Spring boot");
          int rows = pst.executeUpdate();
          System.out.println(rows + "rows inserted successfully");
          
  }catch (Exception e) {
    e.getStackTrace();
  }
  }
}
