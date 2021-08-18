package Collections;

public class StackImplementation {

	int size;
	int arr[];
	int top;
	
	StackImplementation(int size) {
		// TODO Auto-generated constructor stub
		
		this.size = size;
		top = -1;
		arr = new int[size];		//new allocates an amount of memory needed to store the object/array that you request. 
									//In this case n numbers of int.
		
	}
	
	
	public void push(int element)
	{
		if(!isFull())
		{
			top++;
			arr[top] = element;
			System.out.println("Pushed element: "+element);
		}
		else
		{
			System.out.println("Stack is full");
		}
	}
	
	public void pop()
	{
		if(!isEmpty())
		{
			int returnedTop = top;
			top--;
			System.out.println("Popped element: "+arr[returnedTop]);
		}
		else
		{
			System.out.println("Stack is empty");
		}
	}
	
	public int peek()
	{
		if(!isEmpty())
		{
			return arr[top];
		}
		else
		{
			System.out.println("Stack is empty");
			return -1;
		}
		
	}
	
	public boolean isEmpty()
	{
		//System.out.println("Stack is emptyyyyyyyyyy");
		return top == -1;
	}
	
	public boolean isFull()
	{
		//System.out.println("Stack is full");
		return top == size-1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StackImplementation s = new StackImplementation(10);
		s.pop();
		s.peek();
		System.out.println(s.isEmpty());
		System.out.println(s.isFull());
		
		s.push(10);
		s.push(20);
		s.push(30);
		s.push(40);
		
		System.out.println(s.peek());
		
		s.pop();
		System.out.println(s.peek());
	}

}
