package mainprojectpack;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import Staff.Adminstrator;
import Staff.Employee;
import Staff.Progrramer;

public class Searlizer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		Employee[] allEmp=new Employee[3];
		
		allEmp[1]=new Progrramer("Test user 2",1,2,2001,2,20000.00,"Airc",10,2000.00,5,"Asd");
		allEmp[2]=new Progrramer("Test user 3",1,2,2001,2,20000.00,"Aircd",10,2000.00,5,"Asddd");
		allEmp[2]=new Progrramer("Test user 4",1,2,2001,2,20000.00,"Aircd",10,2000.00,5,"Asddasdd");
		try {

			
			oos=new ObjectOutputStream(new FileOutputStream("C:\\desktop\\newEmp.dat"));
			for(Employee e:allEmp) {
				oos.writeObject(e);
				
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
