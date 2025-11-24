interface vehicle {
    void start();
}
class car implements vehicle{
    public void start(){
        System.out.println("Car starts with key");
    }
}
class bike implements vehicle{
    public void start(){
        System.out.println("Bike starts with kick");
    }
}
public class interface1{
    public static void main(String[] args) {
        vehicle a;
        a=new car ();
        a.start();;
        a=new bike();
        a.start();;
    }
}
