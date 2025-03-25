import java.io.Serializable;

public class Course implements Serializable{
	private int courseID;
	private String courseName;
	private double fees;
	public Course(int courseID, String courseName, double fees) {
		super();
		this.courseID = courseID;
		this.courseName = courseName;
		this.fees = fees;
	}
}
