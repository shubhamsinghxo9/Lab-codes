class moble{
    int price;
    String brand;
    int storage;
    moble(int p,String b,int s){
        price=p;
        brand=b;
        storage=s;
    }
    void getdetail(){
        System.err.println(brand +"and storage"+storage+ "price is "+price);
    }
}
public class mobilebrand{
    public static void main(String[] args) {
        moble c=new moble(200000,"Iphone",12);
        c.getdetail();
    }
}