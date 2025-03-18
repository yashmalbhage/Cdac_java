public class MyNumberMain{
	public static void main(String args[]){
		MyNumber num1;
		num1 = new MyNumber(4);
		if(num1.isNegative()){
			System.out.println("negative number");

		}else{
			System.out.println("NOT A negative number");
			
		}
		if(num1.isPositive()){
			System.out.println("positive number");

		}else{
			System.out.println("NOT A positive number");
			
		}
		if(num1.isZero()){
			System.out.println("zero");

		}else{
			System.out.println("NOT A zero");
			
		}
		if(num1.isOdd()){
			System.out.println("odd number");

		}else{
			System.out.println("NOT an odd number");
			
		}
		if(num1.isEven()){
			System.out.println("even number");

		}else{
			System.out.println("NOT an even number");
			
		}
	}

}