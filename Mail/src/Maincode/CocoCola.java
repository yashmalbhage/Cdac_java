package Maincode;

import java.util.HashMap;
import java.util.Map;

public class CocoCola {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "cococola";
		Map<Character,Integer> wordCount = new HashMap<>(); 
		for(int i= 0; i<s.length();i++) {
			char c = s.charAt(i);
			if(wordCount.containsKey(c)) {
				int occ = wordCount.get(c);
				occ++;
				wordCount.put(c, occ);
			}else {
				wordCount.put(c, 1);
			}
			
		}
		System.out.println(wordCount);

	}

}
