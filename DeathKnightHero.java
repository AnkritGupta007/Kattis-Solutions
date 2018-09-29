import java.util.Scanner;

public class DeathKnightHero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        
        for (int i = 0; i < n; i++) {
            String pat = sc.next();
            
            if (!pat.matches(".*CD.*"))
                count++;
        }
        System.out.println(count);
    }
}