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
	
	public static void displayTravellingEmployees(Employee[] arr) {
		int totalTravelHours=0;
		for(Employee e : arr) {
			if(e instanceof SalesManger) {
				System.out.println("travel hours -"+((SalesManger)e).getTravelHours());
				System.out.println("Passport number - "+((SalesManger)e).getPassportDetails());
				totalTravelHours +=((SalesManger)e).getTravelHours();
				
			}
			if(e instanceof Progrramer) {
				System.out.println("travel hours - "+((Progrramer)e).getTravelHours());
				System.out.println("Passport number - "+((Progrramer)e).getPassportDetails());
				totalTravelHours+=((Progrramer)e).getTravelHours();
			}
			
		}
		System.out.println("Total travel hours of all the employees - "+totalTravelHours);
		
	}
	
	
	

}
