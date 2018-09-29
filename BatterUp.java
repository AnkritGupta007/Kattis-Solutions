import java.util.Scanner;

public class BatterUp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        double total = 0;
        int count = sc.nextInt();
       
        for (int i = 0; i < count; i++) {
            int curr = sc.nextInt();
            if (curr < 0) continue;
               
            n++;
            total+=(double)curr;
        }
        System.out.println(total/n);
    }
}