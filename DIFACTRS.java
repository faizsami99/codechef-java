
import java.util.*;

public class DIFACTRS{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int number = src.nextInt();
		int count = 0;
		String str = "";
		for(int i=1;i<=number;i++){
			if(number%i==0){
				str = str + " " +i;
				count++; 
			}
		}
		System.out.println(count);
		System.out.println(str.trim());
	}
}
