import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class StudentMain {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		ObjectOutputStream oos = null;
		StudentSer[] stud = new StudentSer[3];
		stud[0]=new StudentSer("Test user 1", 1, 2, 20000, 2023, "Dac", 100000.00, "123123ad", 20);
		stud[1]=new StudentSer("Test user 2", 1, 2, 20000, 2023, "Dac", 100000.00, "123123ad", 20);
		stud[2]=new StudentSer("Test user 3", 1, 2, 20000, 2023, "Dac", 100000.00, "123123ad", 20);
		oos=new ObjectOutputStream(new FileOutputStream("C:\\desktop\\newStudent.dat"));
		for(StudentSer s:stud) {
			oos.writeObject(s);
			
			
		}
		oos.close();
	}

}
