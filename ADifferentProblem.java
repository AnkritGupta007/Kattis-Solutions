import java.util.Scanner;
import java.lang.*;

public class ADifferentProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNextLong()) {
            long ans = sc.nextLong() - sc.nextLong();
            System.out.println((ans < 0) ? -ans : ans);
        }
    }
}