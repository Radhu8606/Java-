import java.util.Scanner;

public class AvgArray{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[10];
        int sum=0;
        for(int i=0;i<10;i++){
            System.out.println("Enter Element");
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("average is:"+sum/10.0);
    }
}