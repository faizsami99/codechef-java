
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class FLOW017{
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int totalCase = scr.nextInt();
        int number;
        for(int i=0;i<totalCase;i++){
            List<Integer> lst = new ArrayList<>();
            for(int j=0;j<3;j++){
                number = scr.nextInt();
                lst.add(number);
            }
            Collections.sort(lst);
            System.out.println(lst.get(lst.size()-2));
        }
    }
}

/*
3 
120 11 400
10213 312 10
10 3 450
*/