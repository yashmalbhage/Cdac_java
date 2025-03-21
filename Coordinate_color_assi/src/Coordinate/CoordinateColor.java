package Coordinate;

public class CoordinateColor extends CoordinateAssign{
	private String color;
	private static String[] Allcolor;
	static {
		Allcolor=new String[5];
		Allcolor[0]="Red";
		Allcolor[1]="Blue";
		Allcolor[2]="Green";
		Allcolor[3]="Yellow";
		Allcolor[4]="Orange";
		
	}
	public CoordinateColor(int x, int y, String c) {
		super(x, y);
		for(int i=0;i<Allcolor.length;i++) {
			if(c.equals(Allcolor[i])) {
				this.color=c;
				break;
			}else {
				this.color="black";
			}
		}
	}
	@Override
	public String toString() {
		return super.toString()+"CoordinateColor [color=" + color + "]";
	}
}
