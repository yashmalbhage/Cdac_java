
public class Employee implements Comparable<Employee>{
	private String name;
	private double salary;
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	@Override
	public int compareTo(Employee o) {
		int compareVal =0;
		if(this.salary>o.salary) {
			compareVal=1;
		}else if(this.salary<o.salary) {
			compareVal=-1;
		}
		return compareVal;
	}
	

}
