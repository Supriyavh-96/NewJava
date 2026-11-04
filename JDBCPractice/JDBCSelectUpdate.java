package JDBCPractice;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class JDBCSelectUpdate {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_practice";
    String username = "root";
    String password = "workbench@1234";
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your name: ");
    String name = sc.nextLine();
    System.out.println("Enter your age: ");
    int age = sc.nextInt();
    String query = "UPDATE Students SET age=? WHERE name=?";
    try(Connection con = DriverManager.getConnection(url, username, password);
  PreparedStatement pst = con.prepareStatement(query)){
    pst.setInt(1, age);
    pst.setString(2, name);
    int rows = pst.executeUpdate();
     System.out.println(rows + " row updated successfully!");

    System.out.println(name + " | " + age );

}catch(Exception e){
  e.printStackTrace();
}
  }
}