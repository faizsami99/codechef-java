
import java.util.*;

public class TLG{
	public static void main(String[] args) {
		Scanner src=new Scanner(System.in);
        int round=src.nextInt();
        int lead=0;
        int win=-1;
        int s1=0,s2=0;
        for (int i=0;i<round;i++){
            int score_player1=src.nextInt();
            int score_player2=src.nextInt();
            s1+=score_player1;
            s2+=score_player2;
           if((s1-s2)>lead){
               win=1;
               lead=s1-s2;
           }
           if((s2-s1)>lead){
               win=2;
               lead=s2-s1;
           }
        }
        System.out.print(win+" "+lead);
	}
}
