import java.util.Scanner;

public class Main {
	public static void nameCheck(String firstName) throws NameException {
		if(!(firstName.charAt(0)>='A'&& firstName.charAt(0)<='Z')) {
			throw new NameException("Name should start with capital letter");
		}
		for(int i=1;i<firstName.length();i++) {
			if(!(firstName.charAt(i)>='a'&& firstName.charAt(i)<='z')) {
				throw new NameException("other letter shoudl be small");
				
			}
		}
		System.out.println("Name is correct");
	}
	
	public static void main(String[] args) {
		Scanner fn= new Scanner(System.in);
		String fname = fn.next();
		try {
			nameCheck(fname);
		} catch (NameException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
	}
}
