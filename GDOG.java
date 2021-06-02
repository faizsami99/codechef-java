
import java.util.*;

public class GDOG{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
		    int n = sc.nextInt();
		    int k = sc.nextInt();
		    int max = -1; 
		    for(int j=2; j<=k; j++) 
		        max = Math.max(max,n%j);
		    System.out.println(max);
		}
	}
}