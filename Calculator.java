public class Calculator {
  
  int add(int a, int b){
    return a+b;
  }

  int subtract(int a, int b){
    return a-b;
  }
  int multiply(int a, int b){
    return a*b;
  }

  public static void main(String[] args) {
    Calculator c1 = new Calculator();

    System.out.println("Addition: "+  c1.add(10, 20));
    System.out.println("Subtraction : " + c1.subtract(40, 30));
    System.out.println("Multiply: " + c1.multiply(50, 4));

  }
}
