import java.util.*;
public class TryCatch{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		try{
             System.out.println("Enter number 1:");
             int a = sc.nextInt();
              System.out.println("Enter number 2:");
             int b = sc.nextInt();
             double ans = a/b;
             System.out.println("Answer :"+ans);
		}
		catch(ArithmeticException ae){
			System.err.print("division is not possible");
		}
		System.out.println("Good Bye");
		sc.close();
	}
}