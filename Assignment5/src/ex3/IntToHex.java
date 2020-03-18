package ex3;
import java.util.Scanner;

public class IntToHex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int userVal = 0;
		try {
			System.out.print("User input: ");
			userVal = input.nextInt();
			//convert to Hex
			String output = Integer.toHexString(userVal); 
			System.out.println("User Input to Hex: " + output);
			
			//convert back to integer
			int tmp = Integer.parseInt(output, 16);
			System.out.println("User Input to Integer: " + tmp);
			input.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
