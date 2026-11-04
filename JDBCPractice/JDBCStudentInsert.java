package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCStudentInsert {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_practice";
    String username = "root";
    String password = "workbench@1234";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: " );
    String name = sc.nextLine();
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    sc.nextLine();
    System.out.println("Enter your course: ");
     String course = sc.nextLine();
   String query ="InSERT INTO students (name,age,course) VALUES (?,?,?)";
   try(Connection con = DriverManager.getConnection(url, username, password);
  PreparedStatement pst = con.prepareStatement(query)){
     pst.setString(1, name);
     pst.setInt(2, age);
     pst.setString(3, course);
     int rows = pst.executeUpdate();
      System.out.println( rows + "row inserted successfully!");
     System.out.println( name + "|" + age + "|" + course);
  }catch(Exception e){
    e.getStackTrace();
  }
  }
}
