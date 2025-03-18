public class Prime{
	public static void main(String args[]){
		int count = 0;
		boolean flag = true;

		for(int i = 11; i<=99; i++){
		
			for(int j= 0 ; j<i/2; j++){
				if(i%j==0){
				flag=false;
				
				break;
				}
				
				
			
		}
		if(flag){
		count++;
	}
		System.out.prinln(count);
	}
		
		
		

			
			
	}
}

