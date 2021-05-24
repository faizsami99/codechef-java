import java.util.*;

class FLOW014
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        int h,te;
        double c;
        while(t-->0)
        {
            h = sc.nextInt();
            c = sc.nextDouble();
            te = sc.nextInt();
            if(h > 50 && c < 0.7 && te > 5600)
            {
                System.out.println("10");
            }
            else if(h > 50 && c < 0.7)
            {
                System.out.println("9");
            }
            else if(te > 5600 && c < 0.7)
            {
                System.out.println("8");
            }
            else if(h > 50 && te > 5600)
            {
                System.out.println("7");
            }
            else if(h > 50 || c < 0.7 || te > 5600)
            {
                System.out.println("6");
            }
            else
            {
                System.out.println("5");
            }
        }
    }
}

