import java.io.*;
public class LAB11A_1{
  public static void main(String[]args){
  	String Filename = "abc.txt";
  	try{
  		BufferedWriter bw = new BufferedWriter(new FileWriter(Filename));
  		bw.write("radhu,19\n");
  		bw.write("diya,29\n");
  		bw.write("atmik,49\n");
  		bw.write("viral,69\n");
  		bw.close();
  		System.out.println("Data written successfully");
  	}
  	catch(Exception e){
        e.printStackTrace();
  	}
  	class Student{
  		String name;
  		int age;
  		Student(String name,int age){
  			this.name = name;
  			this.age = age;
  		}
  		public String toString(){
  			return "name :"+name+", age :"+age;		
  		}
  	}
  	try{
  		BufferedReader br = new BufferedReader(new FileReader(Filename));
  		String line;
  		while((line = br.readLine())!= null){
  			String name_age[] = line.split(",");
  			String name = name_age[0];
  			int age = Integer.parseInt(name_age[1]);
  			Student s1 = new Student(name,age);
  			System.out.println(s1);
  		}
  	}
  	catch(Exception e){
  		e.printStackTrace();
  	}
  }
}