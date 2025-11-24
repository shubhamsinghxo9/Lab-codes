public class check{
    public static void main(String[] args) {
        try {
    int[] arr = new int[3];
    arr[5] = 50;  
} 
catch (Exception e) {
    System.out.println("General Error"+e.getMessage());
}
    }
}