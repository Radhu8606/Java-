import java.io.*;
public class LAB11A_4{
	public static void main(String [] args){
       String Filename = "xyz.text";
       try{
       	DataOutputStream dos= new DataOutputStream( new FileOutputStream(Filename));
       	dos.writeUTF("radhu,19\n");
  		dos.writeUTF("diya,29\n");
  		dos.writeUTF("atmik,49\n");
  		dos.writeUTF("viral,69\n");
  		dos.close();
  		System.out.println("Data written successfully");
       }
       catch(Exception e){
       	e.printStackTrace();
       }

       
	}
}
