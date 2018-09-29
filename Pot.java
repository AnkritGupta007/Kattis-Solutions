import java.util.Scanner;

public class Pot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), total = 0;
        
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            int num = temp/10;
            int power = temp%10;
            total += Math.pow(num, power);
        }
        System.out.println(total);
    } 
}