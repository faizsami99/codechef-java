
import java.util.Scanner;

class Codechef{
	public static void main(String[] args) {
		try {
		     Scanner sc=new Scanner(System.in);
		     int t=sc.nextInt();
		     for(int i=0;i<t;i++)
		     {
		          int n=sc.nextInt();
		          int arr[]=new int[n];
		          for(int j=0;j<n;j++)
		          {
		               arr[j] =sc.nextInt();
		          }
		          int l=Codechef.gcd(arr);
		          for(int k=0;k<n;k++)
		          {
		               System.out.print(arr[k]/l+" ");
		          }
		          System.out.println();
		     }
		} catch(Exception e) {
		}
	}
	public static int gcd(int arr[]){
	    int g=arr[0];
	    for(int i=1;i<arr.length;i++){
	        g=Codechef.GCD(g,arr[i]);
	    }
	  	return g;
	}
	public static int GCD(int a,int b){
	    if(b==0)
	          return a;
	    return Codechef.GCD(b,a%b);
	}
}