import Staff.Person;

public class StudentSer extends Person{
	private  Course course;
	private String prn;
	transient private int age;
	public StudentSer(String name, int d, int m, int y, int cid, String cName, double fees, String prn, int age) {
		super(name, d, m, y);
		this.course = new Course(cid, cName, fees);
		this.prn = prn;
		this.age = age;
	}

	
	
	

}
