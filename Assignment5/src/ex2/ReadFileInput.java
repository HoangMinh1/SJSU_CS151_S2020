package ex2;
import java.io.*;

public class ReadFileInput {

	public static void main(String[] args) throws IOException{
		FileInputStream myFileInput = null;
		byte[] byteValue = null;
		try {
			myFileInput = new FileInputStream("quote.txt");
			byteValue = myFileInput.readAllBytes();
			//convert byte to String
			String result = new String(byteValue);
			System.out.println(result);
		}
		finally {
			if(myFileInput != null)
				myFileInput.close();
		}
	}

}
