public class Fib{
	public static void main(Strings args[]){
		int fib = 0;
		int n = Integer.parseInt(args[0]);
		for(int i = 0; i<=n; i++){
			fib = fib+i;
		}
		System.out.println(fib);
	}
}