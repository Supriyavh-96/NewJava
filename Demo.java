abstract class Animal {
  abstract void sound();
        void eat(){
          System.out.println("Animal is eating");
        }
  }

 class Dog extends Animal {
   @Override
   void sound(){
         System.out.println("Dog barks");
   }
    
  }
  

public class Demo {
    public static void main(String[] args) {
      Animal a1 = new Dog();
      a1.sound();
      a1.eat();
    }  
}
