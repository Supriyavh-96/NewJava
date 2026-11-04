package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class JDBCExtract {
   public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_practice";
    String username = "root";
    String password = "workbench@1234";
    String query = "SELECt id, name, age, course FROM students WHERE course =?";
    try(Connection con = DriverManager.getConnection(url, username, password);
    PreparedStatement pst = con.prepareStatement(query)){
    pst.setString(1, "java");
    try ( ResultSet rs = pst.executeQuery()){
      while (rs.next()) {
        
      System.out.println(rs.getInt("id")+"-"  + rs.getString("name")+ "-" + "(age  " + rs.getInt("age")+ ")");
    }
  }
}catch(Exception e){
      e.printStackTrace();
    }
  }
  
}
