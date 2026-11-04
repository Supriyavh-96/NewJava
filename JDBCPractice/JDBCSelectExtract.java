package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class JDBCSelectExtract {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_practice";
    String username = "root";
    String password = "workbench@1234";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: " );
    String name = sc.nextLine();
    String query = "SELECT id,name,age,course FROM students WHERE name=?";
    try(Connection con = DriverManager.getConnection(url, username, password);
  PreparedStatement pst = con.prepareStatement(query)){
    pst.setString(1, name);
    ResultSet rs =pst.executeQuery();
    while (rs.next()) {
      int id = rs.getInt("id");
      String studentName = rs.getString("name");
      int age = rs.getInt("age");
      String course = rs.getString("course");
    
      System.out.println(id + "|" + studentName + "|" + age + "|" + course);
    }
    }catch(Exception e){
      e.printStackTrace();
    }
}
}
