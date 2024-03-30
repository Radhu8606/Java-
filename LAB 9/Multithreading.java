public class Multithreading{
	public static void main(String [] args){
           // Runnable r1 = new display1();
           // Runnable r2 = new display2();

           Thread t1 = new Newthread("Good Morning");
           Thread t2 = new Newthread("Good Afternoon");

           t1.start();
           t2.start();
	}
}
class Newthread extends Thread{
	String msg ;
	Newthread(String msg){
        this.msg = msg;

	}
	public void run(){
		try{
			for(int i=0;i<=100;i++){
				System.out.println(msg);
			Thread.sleep(1000);
			}
            
		}
		catch(Exception e){
          e.printStackTrace();
		}
	}
}