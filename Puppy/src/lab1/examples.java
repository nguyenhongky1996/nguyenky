/**
 * 
 */
package lab1;

import java.util.Scanner;

/**
 * @author Admin
 *
 */
public class examples {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

    	Scanner input1 = new Scanner(System.in);
    	System.out.print("Enter an integer: ");
    	int A = input1.nextInt();
    	System.out.println("A : " + A);
    	
    	Scanner input2 = new Scanner(System.in);
    	System.out.print("Enter an integer:");
    	int B = input2.nextInt();
    	System.out.println("B : " + B);
    
    	
    	System.out.println("A + B :" +(A + B));
    	System.out.println("A - B :"+ (A - B));
    	System.out.println("A % B :" + (A % B));
    	System.out.println("A / B :" + (A / B));
    	System.out.println(check(A,B));
    	System.out.println(++A);
    	System.out.println(--B);
	}
	public static String check(int A, int B) {
		//return (A > B) ? "A > B" : "A <= B";
		if(A > B) {
			return "A > B";
		}
		else {
			return "A <= B";
		}
		
	

}
}

