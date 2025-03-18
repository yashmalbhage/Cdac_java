package Staff;

import basic.Date;

public class Person {
	private String name;
	private Date bdate;
	public Person(String name, int d, int m, int y) {
		super();
		this.name = name;
		this.bdate = new Date(d,m,y);
	}
	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}
	public void display() {
		System.out.println("Name of the person is - "+name);
		System.out.print("Birthdate is - ");
		bdate.display();
		
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", bdate=" + bdate.toString() + "]";
	}
	
	

}
