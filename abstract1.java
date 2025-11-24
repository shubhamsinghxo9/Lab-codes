abstract class animal{
   abstract  void sound();
   void eat(){
    System.out.println("eat");
   }
}
class dog extends animal{
    void sound(){
        System.out.println("this is ");
    }
}

public class abstract1{
    public static void main(String[] args) {
        animal a=new dog();
        a.sound();
        a.eat();

    }
}