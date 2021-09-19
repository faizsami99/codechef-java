
import java.util.*;

public class FINDMELI{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int num = src.nextInt();
		int k = src.nextInt();
		List<Integer> mylist = new ArrayList<>();
		for(int i=0;i<num;i++){
			mylist.add(src.nextInt());
		}
		if(mylist.indexOf(k)>=0)
			System.out.println("1");
		else
			System.out.println("-1");
	}
}

