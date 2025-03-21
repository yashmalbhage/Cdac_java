package Stackimp;

public class Mainstack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack s1 = new Stack(0);
		try {
			s1.push(10);
		} catch (StackOverflowException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
