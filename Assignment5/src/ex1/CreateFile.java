package ex1;
import java.io.*;
import java.util.Scanner;

public class CreateFile {
	
	public static void main(String args[]) throws IOException{
		
		Scanner input = new Scanner(System.in);
		String line = "";
		FileOutputStream myFileOut = null;
		try {
			
			myFileOut = new FileOutputStream("command_line_input.txt");
			//user enter inputs
			System.out.println("Start writing: ");
			line = input.nextLine();
			while(line.compareTo("@q") != 0) {
				byte[] lineToByte = line.getBytes();
				//write to File
				myFileOut.write(lineToByte);
				line = input.nextLine();
				
			}
			input.close();
		}
		finally {
			if(myFileOut != null)
				myFileOut.close();
		}
	}

}
