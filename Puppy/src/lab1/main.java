/**
 * 
 */
package lab1;

/**
 * @author Admin
 *
 */
public class main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		//job jbjob1 = new job(145, "hr");
		job jbjob2 = new job(145, "CEO");
		job jbjob3 = new job(145, "devolopment");
		job jbjob4 = new job(145, "CEO");
		job jbjob5 = new job(145, "BA");
		
		
		
		employee employee1 = new employee("Nguyen Hong Ky", 1, 10000, 023, new job(1, "hr"), true);
		employee employee2 = new employee("Nguyen Hong B", 2, 20000, 023, jbjob2, true);
		employee employee3 = new employee("Nguyen Hong C", 3, 30000, 023, jbjob3, false);
		employee employee4 = new employee("Nguyen Hong D", 4, 40000, 023, jbjob4, true);
		employee employee5 = new employee("Nguyen Hong E", 5, 50000, 023, jbjob5, true);
		
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println(employee4);
		System.out.println(employee5);
		
		employee[] employeess = new employee[5];
		employeess[0] = employee1;
		employeess[1] = employee2;
		employeess[2] = employee3;
		employeess[3] = employee4;
		employeess[4] = employee5;
		
		System.out.println("Mang co : " + employeess.length + "phan tu ");
		for(int i = 0 ; i< employeess.length; i++) {
			System.out.println(employeess[i].name + " " + employeess[i].age + " " + employeess[i].id + " " + employeess[i].salary + " " + employeess[i].married + " " + employeess[i].job.name);

		}
		
		
	}

}
