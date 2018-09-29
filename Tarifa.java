import java.util.Scanner;

public class Tarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int n = sc.nextInt();
        int total = X;
        
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            if (temp > X) {
                total -= (temp-X);
                continue;
            }
            total += (X-temp);
        }
        System.out.println(total);
    }
}