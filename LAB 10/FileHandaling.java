import java.io.*;
public class FileHandaling{
	public static void main(String[]args){
		try{
			PrintWriter pw = new PrintWriter(new FileReader("abc.txt"));
			pw.write("Hello\n");
			pw.write("radhu\n");
			pw.write("hsbdxugste dcbishdytrfcsu kdcjnsyihe\n");
			pw.close();
            
            FileReader f = new FileReader("abc.txt");
            BufferedReader br = new BufferedReader(new FileReader("abc.txt"));
            int charCount = 0;
            int wordCount = 0;
            int lineCount = 0;

            String line;

            while((line = br.readLine())!=null){
            	lineCount++;
            	charCount = charCount + line.length();
            	String[] words=line.Split("\\s+");
            	wordCount = words.Length();
;           }
             System.out.println("Character:"+charCount);
             System.out.println("Word:"+wordCount);
             System.out.println("Line:"+lineCount);
		}
		catch(FileNotFoundException fe){
               fe.printStackTrace();
		}
		catch(Exception e){
             e.printStackTrace();
		}
	}
}