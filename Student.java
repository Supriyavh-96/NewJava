public class Student {
    void display( String name, int age){
System.out.println("Name: "+ name);
System.out.println("Age : "+ age);
  }

  public static void main(String[] args) {
    Student s1 = new Student();
    s1.display("Supriya", 30);
  }
}
