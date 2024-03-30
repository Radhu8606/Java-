import java.util.scanner
public class basiccalculater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in)
        System.out.println("Enter Two Numbers :");
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        System.out.println(Enter Operator : +,-,*,/);
        char op=sc.next().charAt(0);
        double cal=0;
        switch(op)
        case('+'):{
                cal=a+b;
                System.out.println("Final Ans. is : +(a+b)");
                break;
        }
        case('-'):{
                cal=a-b;
                System.out.println("Final Ans. is : +(a-b)");
                break;
        }
        case('*'):{
                cal=a*b;
                System.out.println("Final Ans. is : +(a*b)");
                break;
        }
        case('/'):{
                cal=a/b;
                System.out.println("Final Ans. is : +(a/b)");
                break;
        }
        default :{
            System.out.println("Enter Valid Operator");
        }
    }
    
}
