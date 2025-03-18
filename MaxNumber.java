public class MaxNumber{
	public static void main(String args[]){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int c=Integer.parseInt(args[2]);
		if(a>b && a>c){
		   System.out.println("Greatest number among the three is " + a);
		}else if(b>a && b>c){
		   System.out.println("Greates number among the three is " + b);
		}else{
		  System.out.println("Greates number among the three is " + c);
		}
		
}
}