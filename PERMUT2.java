import java.io.*;
import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

public class PERMUT2
{
    public static void main(String[] args)throws java.lang.Exception {
        try {
            //code
            Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                while(n!=0)
                {
                    int[] arr = new int[n];
                    int[] inv = new int[n];
                for (int i = 0; i < n; i++)
                {
                    arr[i] = sc.nextInt();
                    inv[arr[i]-1] = i+1;
                }
                int count=0;
                for(int i=0 ; i<n ; i++)
                {
                    if(arr[i]==inv[i])
                    {
                        count++;
                    }
                }
                if(count==n)
                {
                    System.out.println("ambiguous");
                }
                else
                {
                                    System.out.println("not ambiguous");
                }
                n = sc.nextInt();
            }
        }
       catch (Exception e)
       {
           return;
       }
    }
}
