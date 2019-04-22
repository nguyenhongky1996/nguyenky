/**
 * 
 */
package Contants;

/**
 * @author Admin
 *
 */
public class Dog {

	protected String name;
	protected String color;
	protected String breed;
	
	
	
	

	public Dog(String name, String color, String breed) {
		super();
		this.name = name;
		this.color = color;
		this.breed = breed;
	}

	public static void waggingthetail(String waggingthetail) {
		System.out.println(waggingthetail);
	}
	
	public static void barking (String barkingthetail) {
		System.out.println(barkingthetail);
	}
	public static void eating (String eatingthetail) {
		System.out.println(eatingthetail);
	}
	

}
