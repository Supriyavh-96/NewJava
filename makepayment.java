abstract class Payment {

  abstract void MakePayment();
  void amount(){
    System.out.println("make Payment");
  }
  
}
   
 class  UPI extends Payment{
   @Override
   void MakePayment(){
    System.out.println("Make payment through upi");
   }
 }


 class  CreditCard extends Payment{
   @Override
   void MakePayment(){
    System.out.println("Make payment through cerdit card");
   }
 }

 class  NetBanking extends Payment{
   @Override
   void MakePayment(){
    System.out.println("Make payment through net banking");
   }
  }

public class makepayment {
  public static void main(String[] args) {
    
   
 Payment p1 = new UPI();
  Payment p2 = new CreditCard();
   Payment p3 = new NetBanking();
    p1.MakePayment();
     p2.MakePayment();
      p3.MakePayment();
       
  }  
}
