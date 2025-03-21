package Staff;

public class SalesManger extends Employee implements iTraveller{
	private double salesTarget;
	private double perCommission;
	private String passportNumber;
	private int travelhours;
	public SalesManger(String name, int d, int m, int y, int empid, double salary, double salesTarget,
			double perCommission, int travelhours,String passportNumber) {
		super(name, d, m, y, empid, salary);
		this.salesTarget = salesTarget;
		this.perCommission = perCommission;
		this.travelhours=travelhours;
		this.passportNumber=passportNumber;
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
	@Override
	public String getPassportDetails() {
		// TODO Auto-generated method stub
		return passportNumber;
	}
	@Override
	public int getTravelHours() {
		// TODO Auto-generated method stub
		return travelhours;
	}
	

}
