class Coordinate{
	private int x;
	private int y;
	public void setCoordinate(int x, int y){
		this.x = x;
		this.y=y;
	}
	public void displayCoordinate(){
		System.out.println("["+x+","+y+"]");
	}
}