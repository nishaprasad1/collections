import java.util.*;


public class StackDemo {

	int tos,MaxSize,stack[];

	void createStack(int size) {
		tos = -1;
		MaxSize=size;
		stack= new int[MaxSize];

	}
	void push(int e) {
		tos++;
		stack[tos]=e;

	}
	int pop() {
		int temp=stack[tos];
		tos--;
		return (temp);
	}
	boolean isFull() {
		if(tos==MaxSize-1)
			return true;
		else 
			return false;
	}
	boolean isEmpty() {
		if(tos==-1) 
			return true;
		else
			return false;
	}
	int peek() {
		return stack[tos];
	}
	void printStack() {
		for(int i=tos;i>-1;i--)
			System.out.println(stack[i]);

	}


	public static void main(String args[]) {
		int ch,e;
		var obj=new StackDemo();
		Scanner ni =new Scanner (System.in) ;
		System.out.println("enter the size : ");
		int s=ni.nextInt();
		obj.createStack(s);
		do {
			System.out.println("1.push\n2.pop\n3.peek\n4.print\n0.exit");
			ch=ni.nextInt();
			switch(ch)
			{
			case 1:
				if(!obj.isFull()) {
					System.out.println("Enter the data :");
					e=ni.nextInt();
					obj.push(e);
					System.out.println("Pused");
				}
				else 
					System.out.println("Stack is Full");
				break;
			case 2:
				if(!obj.isEmpty()) {
					e=obj.pop();
					System.out.println("Poped :"+e);
				}
				else
					System.out.println("Stack is Empty");
				break;
			case 3:
				if(!obj.isEmpty()) {
					e=obj.peek();
					System.out.println("@ Peek" +e);
				}
				else
					System.out.println("Stack is Empty");
				break;
			case 4:
				if(!obj.isEmpty()) {
					System.out.println("stack has :");
					obj.printStack();

				}
				else
					System.out.println("Stack is Empty");
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

