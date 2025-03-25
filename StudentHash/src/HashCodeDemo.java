import java.util.*;


public class HashCodeDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> studentSet = new HashSet<>();
		studentSet.add(new Student(1, "Test user 1", "Mumbai", 78.4f));
		studentSet.add(new Student(2, "Test user 2", "Pune", 58.4f));
		studentSet.add(new Student(3, "Test user 3", "Nashik", 98.4f));
		studentSet.add(new Student(4, "Test user 4", "Mumbai", 18.4f));
		
		studentSet.add(new Student(5, "Test user 5", "Mumbai", 48.4f));
		studentSet.add(new Student(6, "Test user 6", "Pune", 68.4f));
		for(Student s:studentSet) {
			System.out.println(s);
		}
	

	}

}
