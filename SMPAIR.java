
import java.util.*;

public class SMPAIR{
	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		int totalCase = scr.nextInt();
		int number;
		for(int i=0;i<totalCase;i++){
			List<Integer> lst = new ArrayList<Integer>();
			num = scr.nextInt();
			for(int j=0;j<num;j++){
				lst.add(scr.nextInt());
			}
			Collections.sort(lst);
			num = lst.get(0) + lst.get(1);
			System.out.println(num);
		}
	}
}

/*

1
4
5 1 3 4

*/