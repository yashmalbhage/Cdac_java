
public class Employee implements Comparable<Employee>{
	private int empid;
	private String name;
	private double salary;
	private String dept;
	
	public Employee(int empid, String name, double salary, String dept) {
		super();
		this.setEmpid(empid);
		this.name = name;
		this.salary = salary;
		this.setDept(dept);
	}
	@Override
	public int compareTo(Employee o) {
		int compareVal =0;
		if(this.getSalary()>o.getSalary()) {
			compareVal=1;
		}else if(this.getSalary()<o.getSalary()) {
			compareVal=-1;
		}
		return compareVal;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", dept=" + dept + "]\n";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	

}
