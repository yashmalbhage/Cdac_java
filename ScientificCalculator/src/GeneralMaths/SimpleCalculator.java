package GeneralMaths;

public class SimpleCalculator implements iCalculator {
	
	

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return (double)(a+b);
	}

	public SimpleCalculator() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public double multiply(int a, int b) {
		// TODO Auto-generated method stub
		return (double)(a*b);
	}

	@Override
	public double substract(int a, int b) {
		// TODO Auto-generated method stub
		return (double)(a-b);
	}

	@Override
	public double divide(int a, int b) {
		// TODO Auto-generated method stub
		return (double)(a/b);
	}

}
