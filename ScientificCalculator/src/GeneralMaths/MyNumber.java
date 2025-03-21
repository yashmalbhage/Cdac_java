package GeneralMaths;

public class MyNumber implements BasicIntOperation,AdvIntOperation {

	@Override
	public boolean isPrime(int num) {
		boolean flag = false;
		for(int i =2 ;i<num/2;i++) {
			if(num%i==0) {
				flag=true;
			}
		}
		return flag
		;
	}

	@Override
	public double factorial(int num) {
		int factorial = 1;
		for(int i=0;i<=num;i++) {
			factorial = factorial*i;
		}
		return factorial;
	}

	@Override
	public boolean isOdd(int num) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean isEven(int num) {
		// TODO Auto-generated method stub
		return false;
	}

}
