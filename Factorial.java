public class Factorial{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		int factorial = 1;
		for(int i = 1; i<=n; i++){
			factorial = factorial*i;
		}
		System.out.println("Factorial of the given number is "+ factorial);
	}
}