package Maincode;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class StringVowel {

	public static void main(String[] args) {
		Set<String>strings = new TreeSet<>(new Comparator<String>() {
			public int countVowel(String s) {
				int vowelCount=0;
				for(int i=0;i<s.length();i++) {
					if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u'||s.charAt(i)=='A'||s.charAt(i)=='E'||s.charAt(i)=='I'||s.charAt(i)=='O'||s.charAt(i)=='U') {
						vowelCount++;
					}
					
				}
				return vowelCount;
			}

			@Override
			public int compare(String o1, String o2) {
				// TODO Auto-generated method stub
				int diff=countVowel(o2)-countVowel(o1);
				if(diff==0) {
					diff=o1.compareTo(o2);
					
				}
				
				return diff;
			}
			
		});
		strings.add("new");
		strings.add("Pune");
		strings.add("Evening");
		strings.add("rhytm");
		strings.add("newa");
		strings.add("newd");
		System.out.println(strings);
		

	}

}
