import java.util.Scanner;
public static void main(String[]args){
  book obj1 = new book();
  book obj2 = new book_publication();
  book obj3 = new paper_publication();
  Scanner sc = new.Scanner(System.in);
  System.out.println("Enter author name:"+args[0]);
  String name = args[0];
  System.out.println("Enter book title name:"+args[1]);
  String name = args[1];
  System.out.println("Enter paper title name:"+args[2]);
  String name = args[2];
  
}
 public class book{
 	private String author_name;
	book(){

	}
}
class book_publication extends book{
	private String title;
	book_publication(){

	}
}
class paper_publication extends book{
	private String title;
	paper_publication(){

	}
}