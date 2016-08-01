import java.util.*;
public class LinkedListTester {

	public static void main(String[] args) {
		LinkedList list=null;
		Scanner sc=new Scanner(System.in);
		boolean exit=false;
		while(exit!=true) {
			System.out.println("------||MENU||------");
			System.out.println("1-Initialise Linked List");
			System.out.println("2-Insert Link Front");
			System.out.println("3-Insert Link Rear");
			System.out.println("4-Insert Link Middle");
			System.out.println("5-Delete Link Front");
			System.out.println("6-Delete Link Rear");
			System.out.println("7-Delete Link Middle");
			System.out.println("8-Display Linked List");
			System.out.println("0-Exit");
			System.out.print("\nChoice ->");
			int ch=sc.nextInt();
			switch(ch) {
			case 1:
				list=new LinkedList();
				break;
			case 2:
				System.out.print("\nElement ->");
				int element1=sc.nextInt();
				list.insertFront(element1);
				break;
			case 3:
				System.out.print("\nElement ->");
				int element2=sc.nextInt();
				list.insertRear(element2);
				break;
			case 4:
				System.out.print("\nElement ->");
				int element3=sc.nextInt();
				System.out.print("\nPosition ->");
				int position1=sc.nextInt();
				list.insertMiddle(position1,element3);
				break;
			case 5:
				list.deleteFront();
				break;
			case 6:
				list.deleteRear();
				break;
			case 7:
				System.out.print("\nPosition ->");
				int position2=sc.nextInt();
				list.deleteMiddle(position2);
				break;
			case 8:
				System.out.println();
				list.display();
				System.out.println();
				break;
			case 0:
				exit=true;
				break;
			default:
				System.err.println("Wrong Choice!");
			}
		}
	}

}
