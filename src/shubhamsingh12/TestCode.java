package shubhamsingh12;
import java.util.Scanner;

class NewClass {
    public static int numTest(int num) {
        int c = 0;
        for (int i = 20; i <= 40; i++) {
            if (i % num == 0) {
            	int c=i/num;
               
       
            }
        }
        return c;
    }
}

public class TestCode {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("For how many numbers you want to test?");
        int choice = scanner.nextInt();
        
        for (int i = 0; i < choice; i++) {
            System.out.println("Enter num:");
            int numInput = scanner.nextInt();
            int res = NewClass.numTest(numInput);
            System.out.println("/ by " + numInput + " = " + res);
        }
        
        scanner.close();
    }
}
