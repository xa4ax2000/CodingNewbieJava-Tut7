import java.util.Scanner;
public class Main {
	public static void main(String args[]){
		Scanner scannerObject = new Scanner(System.in);
		simpleMessage messageObject = new simpleMessage();
		
		System.out.println("Input your full name: ");
		String name = scannerObject.nextLine();
		
		messageObject.messageOutput1(name);
		
	}
}
