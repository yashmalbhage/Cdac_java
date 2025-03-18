public class BoxMain{
	public static void main(String args[]){
	
	
		Box[] boxes = new Box[3];
		for(int i = 0; i<boxes.length; i++){
			int argsc = i*3;
			int l = Integer.parseInt(args[argsc]);
			int b= Integer.parseInt(args[argsc+1]);
			int h = Integer.parseInt(args[argsc+2]);
			boxes[i] = new Box(l,b,h);
			System.out.println("Volume is " + boxes[i].calcVolume());


		}
		
		
	}
}