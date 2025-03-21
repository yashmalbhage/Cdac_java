package GeneralMaths;

public class ScientificCalc implements iScientificCalculator {

	@Override
	public double add(int a, int b) {
		// TODO Auto-generated method stub
		return (double)(a+b);
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

	@Override
	public double cos(double angle) {
		// TODO Auto-generated method stub
		return Math.cos(angle);
	}

	@Override
	public double sin(double angle) {
		// TODO Auto-generated method stub
		return Math.sin(angle);
	}

	@Override
	public double tan(double angle) {
		// TODO Auto-generated method stub
		return Math.tan(angle);
	}

}
