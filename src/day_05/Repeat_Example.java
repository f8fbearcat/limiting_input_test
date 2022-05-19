package day_05;
import java.util.Scanner; 
public class Repeat_Example {
public static void main(String[] args) {
///	String input_str;
///	int b = 0;
	int c ;
		Scanner input = new Scanner(System.in);
		try {
		c = input.nextInt();	
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		finally
		{	System.out.println("is OK 2 GO");
/////			b++;
			input.close();
		}
/////	System.out.println("integer only!");
	
	}
}