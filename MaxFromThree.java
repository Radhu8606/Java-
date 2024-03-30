import java.util.Scanner;

public class MaxFromThree {
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        if(a>b){
            if(a>c){
                System.out.println("a is Maximum Number");
            }
            else{
                System.out.println("c is Maximum Number");
            }
        }
         else
         {
                if(b>c){
                    System.out.println("b is Maximum Number");
                }
                else{
                    System.out.println("c is Maximum Number");
                }
        }
    }
}
