public class Employee {


  String getEmployeeName(){
    return "Spandana";
  }
  int getSalary(){
    return 60000;
  }

  public static void main(String[] args) {
     
    Employee e1 = new Employee();
   System.out.println("Employee Name: "+ e1.getEmployeeName());
   System.out.println("Salary: " + e1.getSalary());

  }
}
