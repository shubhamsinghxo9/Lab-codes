package shubhamsingh12;

import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        try {
        	int x=sc.nextInt();
            int y=sc.nextInt();
            int result=x/y;
            System.out.println(result);
        }
        catch (ArithmeticException e) {
        	System.out.println("canot divide ");
        }
        finally {
        	
        }
       
    }
}
