class animal{
    void eat(){
        System.err.println("dog is eating ");
    }
}
class dog extends animal{
    void bark(){
        System.err.println("dog is bark ");
    }
}
public class inheritance{
    public static void main(String[] args) {
        dog f=new dog();
        f.eat();
        f.bark();

    }
}