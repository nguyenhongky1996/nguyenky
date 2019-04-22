/**
 * 
 */
package lab1;

/**
 * @author Admin
 *
 */
public class employee {

	protected String name;
	protected int id;
	protected double salary;
	protected int age;
	protected job job;
	protected boolean married;
	
	public  employee(String name, int id, double salary, int age, job job, boolean married) {
		super();
		this.name = name;
		this.id = id;
		this.salary = salary;
		this.age = age;
		this.job = job;
		this.married = married;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public job getJob() {
		return job;
	}

	public void setJob(job job) {
		this.job = job;
	}

	public boolean isMarried() {
		return married;
	}

	public void setMarried(boolean married) {
		this.married = married;
	}

	@Override
	public String toString() {
		return "employee [name=" + name + ", id=" + id + ", salary=" + salary + ", age=" + age + ", job=" + job
				+ ", married=" + married + "]";
	}
}

	
