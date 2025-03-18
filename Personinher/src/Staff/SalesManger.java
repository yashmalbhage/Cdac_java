package Staff;

public class SalesManger extends Employee{
	private double salesTarget;
	private double perCommission;
	public SalesManger(String name, int d, int m, int y, int empid, double salary, double salesTarget,
			double perCommission) {
		super(name, d, m, y, empid, salary);
		this.salesTarget = salesTarget;
		this.perCommission = perCommission;
	}
	public SalesManger() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		super.dislpay();
		System.out.println("Sales target is - "+salesTarget);
		System.out.println("Per commision is - "+perCommission);
	}
	@Override
	public double calcSalary() {
		
		return salary+(salesTarget*perCommission);
		
	}
	

}
