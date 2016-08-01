
public class LinkedList {
	Node start;
	void insertFront(int element){
		Node newnode=new Node(element);
		Node temp=null;
		if(start==null) start=newnode;
		else {
			temp=start;
			start=newnode;
			start.next=temp;
		}
	}
	int deleteFront(){
		try {
			int val=start.getInt();
			start=start.next;
			return val;
		}
		catch(NullPointerException ex) {
			System.err.println("Error State! :(");
			return -9999;
		}
	}
	void insertMiddle(int position,int element) {
		try {
			int count=1;
			Node ptr=start;
			for(;count<position;count++) ptr=ptr.next;
			Node newnode=new Node(element);
			newnode.next=ptr.next;
			ptr.next=newnode;
		}
		catch(NullPointerException ex) {
			System.err.println("Error State! :(");
			return;
		}
	}
	int deleteMiddle(int position) {
		try {
			int count=1;
			Node ptr=start;
			for(;count<position-1;count++) ptr=ptr.next;
			int val=ptr.next.getInt();
			ptr.next=ptr.next.next;
			return val;
		}
		catch(NullPointerException ex) {
			System.err.println("Error State! :(");
			return -9999;
		}
	}
	void insertRear(int element){
		Node newnode=new Node(element);
		if(start==null) start=newnode;
		else {
			Node ptr=start;
			while(ptr.next!=null) ptr=ptr.next;
			ptr.next=newnode;
		}
	}
	int deleteRear() {
		try {
			Node ptr1=start,ptr2=start;
			while(ptr1.next!=null) {
				ptr2=ptr1;
				ptr1=ptr1.next;
			}
			int val=ptr2.getInt();
			ptr2.next=null;
			return val;
		}
		catch(NullPointerException ex) {
			System.err.println("Error State! :(");
			return -9999;
		}
	}
	void display() {
		Node ptr=start;
		while(ptr!=null) {
			System.out.print(ptr.getInt()+"-->");
			ptr=ptr.next;
		}
	}
}
