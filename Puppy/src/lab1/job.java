/**
 * 
 */
package lab1;

/**
 * @author Admin
 *
 */
public class job {
protected int id;
protected String name;
public job(int id, String name) {
	super();
	this.id = id;
	this.name = name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
	
}
@Override
public String toString() {
	return "job [id=" + id + ", name=" + name + "]";
}

	
}
