
import java.util.*;

public class PRB01{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		int count;
		int num;
		for(int i=0;i<totalCase;i++){
			num = src.nextInt();
			count = 0;
			if(num>1){
				for(int j=2;j<=num;j++){
					if(num%j==0){
						count = count + 1;
					}
					if(count>1){
						System.out.println("no");
						break;
					}
				}
				if(count == 1){
					System.out.println("yes");
				}
			}
			else{
				System.out.println("no");
			}
		}
	}
}