class MyNumber{
	private int num;
	public MyNumber(){
		num = 0;
	}
	public MyNumber(int num){
		this.num = num;
	}
	public boolean isNegative(){
		return num<0;
	}
	public boolean isPositive(){
		return num>0;
	}
	public boolean isZero(){
		return num==0;
	}
	public boolean isOdd(){
		return num%2!=0;
	}
	public boolean isEven(){
		return num%2==0;
	}
	
}