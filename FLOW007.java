
import java.util.*;

public class FLOW007{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		int number;
		int rnumber;
		for(int i=0;i<totalCase;i++){
			number = src.nextInt();
			rnumber = Integer.parseInt(ReverseString.reverseString(number));
			System.out.println(rnumber);
		}
	}
}

class ReverseString{
	public static String reverseString(int number){
		String snumber = String.valueOf(number);
		StringBuilder sb=new StringBuilder(snumber);
		sb.reverse();
		return sb.toString();
	}
}