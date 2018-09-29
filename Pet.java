import java.util.Scanner;
import java.util.Arrays;

public class Pet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = 0, winner = 0;
      
        while (sc.hasNext()) {
            
            for (int i = 1; i <=5; i++) {
               int total = 0;
               
                for (int j = 1; j <=4; j++) {
                    total += sc.nextInt();
                }
                if (total > max) {
                    max = total;
                    winner = i;
                }
            }
        }
        System.out.println(winner+" "+max);
    }
}