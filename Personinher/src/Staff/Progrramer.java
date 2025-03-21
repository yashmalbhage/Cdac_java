package Staff;

public class Progrramer extends Employee implements iTraveller{
	private String projectTitle;
	private int extraHours;
	private double chargerPerExtraHour;
	private String passportNumber;
	private int travelhours;
	public Progrramer(String name, int d, int m, int y, int empid, double salary, String projectTitle, int extraHours,
			double chargerPerExtraHour,int travelhours, String passportNumber) {
		super(name, d, m, y, empid, salary);
		this.projectTitle = projectTitle;
		this.extraHours = extraHours;
		this.chargerPerExtraHour = chargerPerExtraHour;
		this.travelhours=travelhours;
		this.passportNumber=passportNumber;
	}
	public Progrramer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("This is info is about progrramer ");
		super.dislpay();
		System.out.println("Project - "+projectTitle);
		System.out.println("Extra hours worked - "+extraHours);
		System.out.println("Charge per extra hour - "+chargerPerExtraHour);
		
	}
	@Override
	public double calcSalary() {
		// TODO Auto-generated method stub
		
		return salary+(extraHours*chargerPerExtraHour);
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
