/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class Examples2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//char grade = 'C';
		Scanner input2 = new Scanner(System.in);
		System.out.println("Enter : " );
		char grade1 = input2.next().charAt(0);
		switch(grade1) {
		case 'A':
			System.out.println("Excellent");
			break;
		case 'B':
		case 'C':
			System.out.println("Well done");
			break;
		case 'D':
			System.out.println("you passed");
			break;
		case 'F':
			System.out.println("Better try again");
			break;
		default :
			System.out.println("Invalid grade");
		}
		System.out.println("your grade is : " + grade1);

	}

}
