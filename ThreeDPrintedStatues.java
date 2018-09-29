import java.util.Scanner;

public class ThreeDPrintedStatues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int statues = sc.nextInt();
        int printers = 1, days = 0;
        
        while (printers < statues) {
            printers *=2;
            days++;
        }
        System.out.println(days+1);
    }
}