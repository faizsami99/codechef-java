
import java.util.*;

public class FLOW010{
	public static void main(String[] args) {
		LinkList lst = new LinkList();
		lst.insert("Bb", "BattleShip");
		lst.insert("Cc", "Cruiser");
		lst.insert("Dd", "Destroyer");
		lst.insert("Ff", "Frigate");

		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		char  id;
		String ship;
		for(int i=0;i<totalCase;i++){
			id = src.next().charAt(0);
			ship = lst.search(String.valueOf(id));
			System.out.println(ship);
		}

	}
}

class Node{
	String id;
	String ship;
	Node next;
}

class LinkList{
	Node head;

	public void insert(String id, String ship){
		Node node = new Node();
		node.id = id;
		node.ship = ship;

		if(head==null){
			head = node;
		}
		else{
			Node n = head;
			while(n.next ! = null){
				n = n.next;
			}
			n.next = node;
		}

	}

	public String search(String id){
		Node n = head;
		String ship = "";
		while(n.next != null){
			if((n.id).contains(id)){
				ship = n.ship;
			}
			n = n.next;
		}
		if((n.id).contains(id)){
			ship = n.ship;
		}
		return ship;
	}

}


/*3 
B
c
D*/