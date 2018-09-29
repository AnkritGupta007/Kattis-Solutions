import java.util.Scanner;

public class Bijele {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] need = {1,1,2,2,2,8};
        int[] have = new int[6];
        
        for (int i = 0; i < 6; i++) {
            have[i] = sc.nextInt();
            System.out.println(need[i]-have[i]);
        }
    }
}