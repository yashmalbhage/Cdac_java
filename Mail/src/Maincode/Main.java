package Maincode;

import java.time.LocalDateTime;
import java.util.Set;
import java.util.TreeSet;


import Entities.Email;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Email>emailset=new TreeSet<>();
		emailset.add(new Email(1231345, "from a", "radnom mail", "ajshldjbasd", LocalDateTime.of(25,04,1,10,15)));
		emailset.add(new Email(1231345, "from b", "radnom mail", "ajshldjbasd", LocalDateTime.of(2025,04,1,10,15)));
		emailset.add(new Email(1231345, "from c", "radnom mail", "ajshldjbasd", LocalDateTime.of(2025,05,1,10,15)));
		emailset.add(new Email(1231345, "from d", "radnom mail", "ajshldjbasd", LocalDateTime.of(2025,04,1,10,15)));
		
		System.out.println(emailset);
		
		

	}
	

}
