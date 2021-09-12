
import java.util.*;
public class SECLAR{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int size = 3;
		int[] arr = new int[size];
		for(int i=0;i<size;i++){
			arr[i] = src.nextInt();
		}

		Arrays.sort(arr);

		System.out.println(arr[size-2]);

	}
}
