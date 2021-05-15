
import java.util.*;

public class TSORT{
	public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Scanner src = new Scanner(System.in);
        int totalElements = src.nextInt();
        int newElement;
        for(int i=0;i<totalElements;i++){
            newElement = src.nextInt();
            arrayList.add(newElement);
        }
        Collections.sort(arrayList);
        arrayList.forEach(i->System.out.println(i));
	}
}
