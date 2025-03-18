class Box{
	private int length;
	private int breadth;
	private int height;
	public Box(){
		this.length = 4;
		this.breadth = 5;
		this.height=6;

	}
	public Box(int length, int breadth, int height){
		this.length = length;
		this.breadth = breadth;
		this.height=height;
	}
	public void display(){
		System.out.println("Lenght of the box is " + length);
		System.out.println("Breadth of the box is " + breadth);
		System.out.println("Height of the box is " + height);

	}
	public int calcVolume(){
		return length*breadth*height;
	}
	

}