package mainprojectpack;

import Staff.Adminstrator;
import Staff.Employee;
import Staff.Progrramer;
import Staff.SalesManger;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee[] emp = new Employee[4];
		emp[0]=new Adminstrator("Test 1", 4,4,2004,1,2400.00,25000.00);
		emp[1]=new Adminstrator("Test 2", 4,4,2004,1,2400.00,25000.00);
		emp[2]=new SalesManger("Test 3",1,2,2001,5,20000.00,10000.00,20000.00,48,"123asdfgh");
		emp[3]=new Progrramer("Test 4",1,4,2002,6,200000.00,"airbnb",20,20000.00,10,"123dfg87");
		Employee.displayTravellingEmployees(emp);
		
		
	}

}
