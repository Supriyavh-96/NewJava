package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCSelect {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_practice";
    String username = "root";
    String password = "workbench@1234";
    String query = "SELECt id, name, age, course FROM students";
    try(Connection con = DriverManager.getConnection(url, username, password);
    PreparedStatement pst = con.prepareStatement(query);
    ResultSet rs = pst.executeQuery()){
    while (rs.next()){
      int id= rs.getInt("id");
      String name = rs.getString("name");
      int age = rs.getInt("age");
      String course = rs.getString("course");
      System.out.println(id +"|"  + name + "|" + age + "|" + course);
    }
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
