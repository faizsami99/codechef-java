
import java.util.*;
import java.lang.*;
import java.io.*;

class RECTANGL
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0){
		    String str = sc.nextLine();
		    String ip[] = str.split(" ");
		    int a = Integer.parseInt(ip[0]);
		    int b = Integer.parseInt(ip[1]);
		    int c = Integer.parseInt(ip[2]);
		    int d = Integer.parseInt(ip[3]);
		    if((a == b && c == d) || (a == c && b == d) || (a == d && b ==c)){
		        System.out.println("YES");
		    } else{
		        System.out.println("NO");
		    }
		}
	}
}