
import java.util.*;

public class DECINC{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int num = src.nextInt();
		if(num % 4 == 0){
			System.out.println(num + 1);
		}
		else{
			System.out.println(num - 1);	
		}
	}
}