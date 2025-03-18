package Staff;

public abstract class Employee extends Person {
	private int empid;
	protected double salary;
	public Employee(String name, int d, int m, int y, int empid, double salary) {
		super(name, d, m, y);
		this.empid = empid;
		this.salary = salary;
	}
	public Employee() {
		super(); 
		// TODO Auto-generated constructor stub
	}
	public void dislpay() {
		super.display();
		System.out.println("Empid is - "+empid);
	

	}
	public abstract double calcSalary();
	
	
	

}
