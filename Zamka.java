import java.util.Scanner;

public class Zamka {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt(), D = sc.nextInt(), X = sc.nextInt(), min = 0, max = 0;
        
        for (int i = L; i <= D; i++) {
            if (sumDigits(i) == X) {
                min = i;
                break;
            }
        }
        
        for (int i = D; i >= L; i--) {
            if (sumDigits(i) == X) {
                max = i;
                break;
            }
        }
        
        System.out.println(min);
        System.out.println(max);
    }
    
    public static int sumDigits(int n) {
        int sum = 0;
        
        while (n > 0) {
            sum += (n % 10);
            n /= 10;
        }
        return sum;
    }
}