public class Divisor{
	public static void main(String args[]){
		int n = Integer.parseInt(args[0]);
		for(int i = 1; i<=n; i++){
			if(n%i==0){
				System.out.println(i + " ");
			}
		}
	}
}