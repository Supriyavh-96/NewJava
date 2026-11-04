public class Mobile {

  void displayDeatils(String brand,String model, int price){
       System.out.println("Brand: " + brand);
       System.out.println("Model: " + model);
       System.out.println("Price: " + price);
    
  }
  String getBrand(){
    return "BMW";
  } 

  int getPrice(){
   return 50000; 
  }
  
   public static void main(String[] args) {
    Mobile m1 = new Mobile();
    Mobile m2 = new Mobile();

    m1.displayDeatils("Tata", "safari", 50000);

    System.out.println();     

    m2.displayDeatils("Audi", "CarWale", 80000);

   }
}
