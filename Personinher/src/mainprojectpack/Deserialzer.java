package mainprojectpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

import Staff.Employee;

public class Deserialzer {
	public static void main(String args[]) throws FileNotFoundException, IOException, ClassNotFoundException {
		Employee[] emp=new Employee[3];
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\desktop\\newEmp.dat"));
		for(int i =0;i<emp.length;i++) {
			Object o = ois.readObject();
			if(o instanceof Employee) {
			   emp[i] = (Employee)o;
			}
		}
		ois.close();
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		
	}

}
