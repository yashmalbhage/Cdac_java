import java.util.Objects;

public class Student {
	private int studentId;
	private String name;
	private String city;
	private float percentage;
	public Student(int studentId, String name, String city, float percentage) {
		super();
		this.studentId = studentId;
		this.name = name;
		this.city = city;
		this.percentage = percentage;
	}
	@Override
	public int hashCode() {
		int code =0;
		if(this.city.equals("Pune")) {
			code = 1;
		}else if(this.city.equals("Mumbai")) {
			code =2;
		}else if(this.city.equals("Nashik")) {
			code =3;
		}else if(this.city.equals("Thane")) {
			code =4;
		}
		return code;
	}
	@Override
	public boolean equals(Object obj) {
		boolean flag = false;
		if(obj instanceof Student) {
			Student s = (Student)obj;
			if(this.studentId==s.studentId && this.name.equals(s.name)&&this.city.equals(s.city)) {
				flag = true;
			}
		}
		return flag;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", name=" + name + ", city=" + city + ", percentage=" + percentage
				+ ", hashCode()=" + hashCode() + "]";
	}
	
	
}
