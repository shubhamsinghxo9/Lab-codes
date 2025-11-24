public class throw1{
    static void check(int age){
        if(age<18){
            throw new ArithmeticException("acess deined you are not 18");
        }
        System.out.println("acess granted");

    }
    public static void main(String[] args) {
        check(15);
    }
}