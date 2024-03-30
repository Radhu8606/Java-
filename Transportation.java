public class Transportation{
	public static void main(String[]args){
      Animal []a = {
      	new Tiger(),new Deer(),new Donkey(),new Camel(),
      };
      for(Animal b : a ){
          if(b instanceof Transport){
          	Transport t1 = (Transport)b;
          	t1.deliver();
          }
      }
	}
}
interface Transport{
	public void deliver();
}
abstract class Animal{

}
class Camel extends Animal implements Transport{
	public void deliver(){

      System.out.println("Hello from camel");
	}
}
class Donkey extends Animal implements Transport{
	public void deliver(){

      System.out.println("Hello from donkey");
	}
}
class Tiger extends Animal{
    
}
class Deer extends Animal{
   
}