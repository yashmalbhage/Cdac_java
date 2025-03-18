class Emp{
	int id;
 	int salary;
	String name;
	public Emp(int id, int salary, String name){
		this.id = id;
		this.salary = salary;
		this.name = name;
	}
	public void dis(){
		System.out.println("name "+name+" Salary "+salary+" id "+id);
	}

}