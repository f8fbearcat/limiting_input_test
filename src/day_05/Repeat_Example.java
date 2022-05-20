package day_05;
import java.util.Scanner; 
public class Repeat_Example {
public static void main(String[] args) {
///	String input_str;
///	int b = 0;
	Scanner input = new Scanner(System.in);
	while(true) {
		if(input.hasNextInt()) {
			System.out.println("OK 2 GO");
			input.close();
			break;
		}
		System.out.println("try again");
		input = new Scanner(System.in);
	}
}
}