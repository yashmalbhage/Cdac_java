package Stackimp;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1 = new Scanner(System.in);
		String str = s1.next();
		boolean flag = false;
		for(int i =0; i<str.length()/2;i++) {
			if(str.charAt(i)==str.charAt(str.length()-1-i)) {
				flag = true;
			}else {
				flag =false;
			}
		}
		System.out.println(flag);
		
		
		
	}

}
