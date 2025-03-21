package Student_Portal_pack;

import java.util.Scanner;

public class StudentMain {
	
	public static void registerUser(String country) throws InvalidCountryException {
		if(country.equals("India")) {
			System.out.println("User regestraion done successfully");
		
		}else {
			throw new InvalidCountryException("No country other than India!");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner count = new Scanner(System.in);
		String country=count.nextLine();
		try {
			registerUser(country);
		} catch (InvalidCountryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
