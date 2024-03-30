public class AbstractVeg {
	public static void main(String[]args){
    	Potato p1 = new Potato();
    	p1.toString();
    	Brinjal p1 = new Brinjal();
    	p1.toString();
    	Tomato p1 = new Tomato();
    	p1.toString();
	}
}
abstract class Vegetables{
	String color;
      Vegetables(String color){
      	this.color=color;
      }
	public abstract String toString();
	
}
class Potato extends Vegetables{
	Potato(String color){
     		super(color);
       }
    public String toString(){
     	String name = "Potato";
     	
     	System.out.println("name:"+name "and color:"+color);
     }
}
class Brinjal extends Vegetables{
		Brinjal(String color){
     	super(color);
       }
     public String toString(){

        String name = "Brinjal";
     
     System.out.println("name:"+name "and color:"+color);
     }
}
class Tomato extends Vegetables{
	Tomato(String color){
     	super(color);
       }
     public String toString(){
     	String name = "Tomato";
     	
     System.out.println("name:"+name "and color:"+color);
     }
}