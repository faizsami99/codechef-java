
import java.util.*;

public class CIELRCPT{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int totalCase = src.nextInt();
		for(int i=0;i<totalCase;i++){
			long sol;
		    long n = src.nextLong();
		    sol = n/2048;
		    n = n%2048;
		    while(n!=0){
		        sol = sol+n%2;
		        n = n/2;
		    }
		    System.out.println(sol);
		}
	}
}