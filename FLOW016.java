
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0;i<T ;i++){
		   long A = sc.nextInt();
		   long B = sc.nextInt();	   
		   long gg= (A>B)? gcd(A,B): gcd(B,A);
		   long ll = A/gg*B;
		   System.out.print(gg);
		   System.out.print(" ");
		   System.out.println(ll);
		    
		}
		
	}
	public static long gcd(long a, long b){	  
	  if(b==0)
	  return a;
	  else return gcd(b,a%b);
	}
}

/*
3 
120 140
10213 312
10 30


20 840
1 3186456
10 30
*/