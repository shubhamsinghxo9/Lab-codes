package shubhamsingh12;
import java.util.Scanner;
public static void numtest(int num;){
	int count=0;
	for(int i=20;i<=40;i++) {
		if(i%num==0) {
			count++;
			
		}
		
	}
}
public class shubh123 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a number: ");
        int num = sc.nextInt();
        numtest(num);
        sc.close();
		
	}

}
