
import java.util.*;

public class PALL01{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		int num;
		int rnum;
		for(int i=0;i<totalCase;i++){
			num = src.nextInt();
			rnum = Integer.parseInt(ReverseString.reverseString(num));
			if(num == rnum){
				System.out.println("wins");
			}
			else{
				System.out.println("loses");
			}
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