/* a class that test some of the control structures available to java
  it uses the scanner object in order to 
  recieve input from the user
 * 
 */
import java.util.Scanner;


public class Basics {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("choose a menu item from 0-5");
		
		
		if(input.hasNextInt()){
		    int number = input.nextInt();
		    switch (number) {
			case 0:
				System.out.println("you will be served with tea");
				break;
			case 1:
				System.out.println("you will be served with water");		
				break;
			case 2:
				System.out.println("you will be served with coffee");
				break;
			case 3:
				System.out.println("you will be served with capucino");
				break;
			case 4:
				System.out.println("you will be served with juice");
				break;
			case 5:
				System.out.println("you will be served with choclate");
				break;
			default:
				System.out.println("Your selection is invalid");
				break;
			}
		}else {
			System.out.println("You must enter only a number ");
			//close the scanner resource to prevent resource leaks.
			input.close();
		}
		
		
	}
	
	
}
