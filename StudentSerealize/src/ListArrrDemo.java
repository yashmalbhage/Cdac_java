import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListArrrDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		List<String> L = new ArrayList<>(5);
		Scanner l1 = new Scanner(System.in);
		String s1 = l1.next();
		L.add(s1);
		Scanner l2 = new Scanner(System.in);
		String s2 = l2.next();
		Scanner l3 = new Scanner(System.in);
		String s3 = l3.next();
		Scanner l4 = new Scanner(System.in);
		String s4 = l4.next();
		Scanner l5 = new Scanner(System.in);
		String s5 = l5.next();
		L.add(s2);
		L.add(s3);
		L.add(s4);
		L.add(s5);
		for(String s:L) {
			System.out.println(s);
		}
		System.out.println("Enter the index which needed to be removed");
		Scanner s = new Scanner(System.in);
		int index = s.nextInt();
		L.remove(index);
		
		System.out.println(L.size());
		Collections.sort(L);
		System.out.println(L);
		System.out.println("Enter the string which need to be check it is there or not -");
		Scanner check1 = new Scanner(System.in);
		String checkstr = check1.next();
		for(int i = 0;i<L.size();i++) {
			if(checkstr.equals(L.get(i))) {
				System.out.println("the given string is present at "+i+"th index");
				break;
			}
		}
		
		
		
	

	}

}
