import java.util.*;
public class Lab81Exception{
   public static void main(String [] args){
   	int ans=1;
   	 try{
   int x = Integer.parseInt(args[0]);
    int y = Integer.parseInt(args[1]);
   
    	if(x==0 && y==0){
    		throw new Exception("x and y both cannot be zero");
    	}
    	else{
    		for(int i=1;i<=y;i++){
    			ans = ans*x;
    		}
    		System.out.println("Answer is "+ans);
    	}
    }
    catch(NumberFormatException e){
       e.printStackTrace();
    }
  }
}