public class EmpMain{
	public static void main(String args[]){
		Emp[] employees = new Emp[5];
        
        
        	for (int i = 0; i < 5; i++) {
            		int argIndex = i * 3; 
            		String name = args[argIndex];
            		int id = Integer.parseInt(args[argIndex + 1]);
            		int salary = Integer.parseInt(args[argIndex + 2]);
            		employees[i] = new Emp(id, salary, name);
		
        	}
	 	for (Emp emp : employees) {
            		emp.dis();
        	}
	}
}