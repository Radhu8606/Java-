public class Oddeven{
	public static void main(String[]args){
       Thread t = new Newthread();
       t.start();
	}
}
class Newthread extends Thread {
	public void run(){
       try{
         for(int i=1;i<=20;i++){
         	if(i%2==0){
         		System.out.println("Odd number:"+i);
         	}
         	else{
         		System.out.println("Even number:"+i);
         	}
         }
       }
       catch(Exception e){
           e.printStackTrace();
       }
	}
}