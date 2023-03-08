import java.util.*;


class Node{
	int data;
	Node next;
	Node(int data)
	{
		this.data=data;
		next=null;
	}
}


public class LinkedListLinear {
	Node root;
	void createLinkedList() {
		root=null;
	}
	void insertLeft(int data) {
		Node n=new Node(data);
		if(root==null) {
			root=n;
		}
		else
			n.next=root;
		root=n;
	}
	void printList() {
		if(root==null)
		{
			System.out.println("Linked is Empty :");
		}
		else{
			Node t;
			t=root;
			while(t!=null) {
				System.out.println(t.data);
				t=t.next;
			}
		}
	}



}
