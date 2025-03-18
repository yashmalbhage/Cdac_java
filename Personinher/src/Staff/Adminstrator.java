package Staff;

public class Adminstrator extends Employee {
	private double allowance;
	

	public Adminstrator(String name, int d, int m, int y, int empid, double salary, double allowance) {
		super(name, d, m, y, empid, salary);
		this.allowance = allowance;
	}


	


	public Adminstrator() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		return salary+allowance;
	}
	

}
