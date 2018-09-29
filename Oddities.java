import java.util.Scanner;

public class Oddities {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
           
            if (temp%2 == 0)
                System.out.println(temp + " is even");
            else
                System.out.println(temp + " is odd");
        }
    }
}