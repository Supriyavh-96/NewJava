package JDBCPractice;
import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCConnection {
  public static void main(String[] args) {
    String url = "jdbc:mysql://localhost:3306/jdbc_practice";
    String username = "root";
    String password = "workbench@1234";
    try{
      Connection con = DriverManager.getConnection(url, username, password);
      System.out.println("Database connected successfully");
    }catch(Exception e){
      e.printStackTrace();
    }
  }
}
