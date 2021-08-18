package Collections;

public class QueueArrayImpl {
	
	int capacity;
	int queueArr[];
	int front;
	int rear;
	int currentSize;
	
	public QueueArrayImpl(int sizeOfQueue) {
		// TODO Auto-generated constructor stub
		this.capacity=sizeOfQueue;
		front = 0;
		rear = -1;
		queueArr = new int[this.capacity];
		
	}
	
	
	public boolean isFull()
	{
		if(currentSize == capacity)
		{
			return true;
		}
		return false;
		
	}
	
	public boolean isEmpty()
	{
		if(currentSize == 0)
		{
			return true;
		}
		return false;
	}
	
	//this method is used add element in the queue
	public void enqueue(int element)
	{
		if(isFull())
		{
			System.out.println("Sorryyyy....queue is full!!!!");
		}
		else
		{
			rear++;
			if(rear == capacity-1)
			{
				rear=0;
			}
			queueArr[rear] = element;
			currentSize++;
			System.out.println(element+" added to the queue");
		}
	}
	
	
	//this method is used to remove element from the front of the queue
	public void deque()
	{
		if(isEmpty())
		{
			System.out.println("Queue is empty cannot delete element");
		}
		else
		{
			front++;
			if(front == capacity-1)
			{
				System.out.println(queueArr[front-1]+ " removed from the queue");
				front = 0;
			}
			else
			{
				System.out.println(queueArr[front-1]+ " removed from the queue");
			}
			currentSize--;
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QueueArrayImpl q = new QueueArrayImpl(5);
		
		q.enqueue(10);
		q.enqueue(20);
		q.enqueue(30);
		//q.enqueue(40);
		//q.enqueue(50);
		q.deque();
	}

}
