class animal{
    void sound(){
        System.out.println("animal make sounds");
    }
}
class dog extends animal{
    void sound(){
 System.out.println("dog make sounds");
    }
}
class cat extends dog{
    void sound(){
         System.out.println("cat make sounds");
    }
}
public class overloading{
    public static void main(String[] args) {
        animal a;
        a=new dog();
        a.sound();
        a=new cat();
        a.sound();
    }
}