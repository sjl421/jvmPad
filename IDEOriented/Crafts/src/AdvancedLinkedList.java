
public class AdvancedLinkedList extends LinkedList {
	
	void merge (LinkedList a) {
		Node ptr=a.start;
		while (ptr!=null) {
			this.insertRear(ptr.getInt());
			ptr=ptr.next;
		}
	}
	
	LinkedList[] split (int position) {
		LinkedList[] l=new LinkedList[2];
		l[0]=new LinkedList();
		l[1]=new LinkedList();
		try {
			int count=1;
			Node ptr=this.start;
			for(;count<position;count++) {
				l[0].insertFront(ptr.getInt());
				ptr=ptr.next;
			}
			while (ptr!=null) {
				l[1].insertFront(ptr.getInt());
				ptr=ptr.next;
			}
		}
		catch(NullPointerException ex) {
			System.err.println("Error State! :(");
		}
		return l;
	}
	
}
