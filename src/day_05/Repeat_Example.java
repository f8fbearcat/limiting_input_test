package day_05;
import java.util.Scanner; 
public class Repeat_Example {
public static void main(String[] args) {
///	String input_str;
	boolean a;
///	int b = 0;
		Scanner input = new Scanner(System.in);
		String c = input.toString();		
		if (input.hasNextInt() == true) {
			System.out.println(c+" is OK 2 GO");
/////			b++;
		}
		else
			System.out.println("integer only!");
		input.close();
	}
}