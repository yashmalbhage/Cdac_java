package Stackimp;


class StackOverflowException extends Exception{

	public StackOverflowException(String m) {
		super(m);
		// TODO Auto-generated constructor stub
	}
	
	
}
class StackUnderflowException extends Exception{

	public StackUnderflowException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
	
}

public class Stack {
	private int [] arr;
	private int size;
	private int top;
	public Stack(int size) {
		super();
		
		this.size = size;
		this.top = -1;
		arr=new int[size];
	}
	public void push(int t) throws StackOverflowException{
		if(top == size-1) {
			throw new StackOverflowException("Stack is full");
		}else {
			arr[++top]=t;
		}
		
	}
	public int pop() throws StackUnderflowException {
		if(top==-1) {
			throw new StackUnderflowException("Stack is empty");
			
		}else {
			return arr[--top];
		}
	}
	
	
	
	

}
