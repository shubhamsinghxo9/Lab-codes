class car{
    String brand;
    int speed;
    void drive(){
        System.out.println(brand+"is good"+speed+"km/hr");
    }
}
public class main {
    public static void main(String[] args) {
        car c1=new car();
        c1.speed=2334;
        c1.brand="BMW";
        c1.drive();
        
    }
}