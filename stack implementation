package javadsa;

public class stackimpl {
int[] arr=new int[5];
int top=0;
	public static void main(String[] args) {
	
		stackimpl s=new stackimpl();
		s.push(2);
		s.push(11);
		s.push(12);
		s.push(9);
		s.push(1);
//		s.push(12);
		s.print();
		System.out.println("  ");
//		s.pop();
		s.pop();
		s.pop();
		s.push(12);
		s.push(1332);
		
		s.print();
		s.peek();
		s.pop();
		s.print();
		s.peek();
	}
	
	public void push(int data)
	{
	try {
		arr[top]=data;
		top++;
	}
	catch(  ArrayIndexOutOfBoundsException e)
	{
		System.out.println("Stack overflow for data " + data + " exceed size " +arr.length);
	}
	
	}
	
	
public void pop()
{
	if(top==0)
	{
		System.out.println(" Nothing to pop ");
		return;
	}
	System.out.println();
	System.out.println(" poped element " +arr[top-1] );
	top--;
	
}
	void peek()
	{
	if(top==0) 
	{
		System.out.println(" Empty stack ");
		return;
	}
	System.out.println(" peek element " +arr[top-1] );	
		
	}
	
	
	
	public void print()
	{
	
		for(int i=top-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	
	
	}
	
	
	
	

}






