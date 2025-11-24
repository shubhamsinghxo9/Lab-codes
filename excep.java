public class excep{
    public static void main(String[] args) {
        try {
            int a=10/0;
        } catch (Exception e) {
            System.err.println("error occured"+e.getMessage());
        }
        System.out.println("Program continues...");
    }
}