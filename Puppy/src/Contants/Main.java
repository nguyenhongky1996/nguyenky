/**
 * 
 */
package Contants;

/**
 * @author Admin
 *
 */
import Contants.Students;
public class Main {

	
	public static void main(String[] args) {
		/*Students stStudent1 = new Students("vu hien", 24,"nu");
		Students stStudent2 = new Students("hong ky", 24,"nam");
		Students stStudent3 = new Students("ky tai", 10,"nam");
		print(stStudent1);
		print(stStudent2);
		print(stStudent3);*/
		Dog dgDog = new Dog("milu", "vang","canh");
		System.out.println(dgDog.breed);
		dgDog.waggingthetail("vay duoi manh");
		dgDog.barking("sua to");
		dgDog.eating("an nhieu");
		


	}
	
	/*public static void print(Students student) {
		System.out.println("ten la "+ student.name);
		System.out.println("tuoi " + student.age);
		System.out.println("gioi tinh " + student.gender);
	}*/

}
