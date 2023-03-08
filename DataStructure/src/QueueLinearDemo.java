import java.util.*;



public class QueueLinearDemo {
	int front ,rear,MaxSize, q[];

	void createQueue(int size) {
		rear = -1;
		front=0;
		MaxSize=size;
		q= new int[MaxSize];

	}
	void enqueue(int e) {
		rear++;
		q[rear]=e;

	}
	int dequeue() {
		int temp=q[front];
		front++;
		return (temp);
	}
	boolean isFull() {
		if(rear==MaxSize-1)
			return true;
		else 
			return false;
	}
	boolean isEmpty() {
		if(front>rear) 
			return true;
		else
			return false;
	}
	int peek() {
		return q[rear];
	}
	void printQueue() {
		for(int i=front;i<=rear;i++)
			System.out.println(q[i]);
	}

	public static void main(String args[]) {
		int ch,e;
		var obj=new QueueLinearDemo();
		Scanner ni =new Scanner (System.in) ;
		System.out.println("enter the size : ");
		int s=ni.nextInt();
		obj.createQueue(s);
		do {
			System.out.println("1.Enqueue\n2.Dequeue\n3.peek\n4.print\n0.exit");
			ch=ni.nextInt();
			switch(ch)
			{
			case 1:
				if(!obj.isFull()) {
					System.out.println("Enter the data :");
					e=ni.nextInt();
					obj.enqueue(e);
					System.out.println("enqueued");
				}
				else 
					System.out.println("Queue is Full");
				break;
			case 2:
				if(!obj.isEmpty()) {
					e=obj.dequeue();
					System.out.println("Dequeue :"+e);
				}
				else
					System.out.println("Queue is Empty");
				break;
			case 3:
				if(!obj.isEmpty()) {
					e=obj.peek();
					System.out.println("@ Peek" +e);
				}
				else
					System.out.println("Queue is Empty");
				break;
			case 4:
				if(!obj.isEmpty()) {
					System.out.println("Queue has :");
					obj.printQueue();

				}
				else
					System.out.println("Queue is Empty");
				break;
			case 0:
				System.out.println("Exiting");
				break;
			default:
				System.out.println("Wrong option Selected ");
				break;
			}
		}while(ch!=0);
	}

}




