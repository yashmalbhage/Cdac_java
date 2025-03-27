import java.util.*;
import java.util.TreeSet;

public class Comparatordemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Employee> empset = new TreeSet<Employee>(new Comparator<Employee>() {

		
			public int compare(Employee o1, Employee o2) {
				int diff =0;
				if(o1.getDept().equals(o2.getDept())) {
					diff=(int)(o1.getSalary()-o2.getSalary());
					if(diff==0) {
						if(o1.getName().equals(o2.getName())) {
							diff=o1.getEmpid()-o2.getEmpid();
							
							
						}else {
							diff=o1.getName().compareTo(o2.getName());
						}
					}
					
				}else {
					diff=o1.getDept().compareTo(o2.getDept());
				}
				
				
				
				return diff;
			}
			
		});
		empset.add(new Employee(1,"emp A", 2000.00, "dept A"));
		empset.add(new Employee(2,"emp B", 2900.00, "dept C"));
		empset.add(new Employee(3,"emp A", 2090.00, "dept A"));
		empset.add(new Employee(4,"emp C", 2010.00, "dept B"));
		empset.add(new Employee(5,"emp B", 2020.00, "dept B"));
		empset.add(new Employee(6,"emp D", 2030.00, "dept B"));
		empset.add(new Employee(7,"emp E", 20040.00, "dept A"));
		empset.add(new Employee(8,"emp D", 20009.00, "dept C"));
		System.out.println(empset);
		



	}

}
