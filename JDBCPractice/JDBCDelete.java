package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JDBCDelete {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_practice";
    String username = "root";
    String password = "workbench@1234";
    String query = "DELETE FROM students WHERE name= ?";
    try(Connection con = DriverManager.getConnection(url, username, password);
        PreparedStatement pst = con.prepareStatement(query)){
          pst.setString(1, "kiran");
          int rows = pst.executeUpdate();
          System.out.println(rows + "row deleted successfully");
          
  }catch (Exception e) {
    e.getStackTrace();
  }
  } 
}
