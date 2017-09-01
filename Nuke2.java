import java.io.*;
public class Nuke2 {
	public static void main(String[] arg) throws Exception {
	BufferedReader keyboard=new BufferedReader(new InputStreamReader(System.in));
		
	System.out.println("Begain to Print");
	System.out.flush();
	String InputLine;
	InputLine=keyboard.readLine();
	for(int i=0;i<InputLine.length();i++){
		if (i==1){
			
		}
		else{
			System.out.print(InputLine.charAt(i));
			}
	}
		
	
	}

}
