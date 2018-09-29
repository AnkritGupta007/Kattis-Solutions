import java.util.Scanner;

public class Soylent {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int total = sc.nextInt();
            int count = total % 400 == 0 ? total/400 : (total/400) + 1;
            System.out.println(count);
        }
    }
}