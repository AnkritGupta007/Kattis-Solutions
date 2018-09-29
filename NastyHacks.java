import java.util.Scanner;

public class NastyHacks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for (int i = 0; i < n; i++) {
            int no_advertise = sc.nextInt();
            int with_advertise = sc.nextInt();
            int ad_cost = sc.nextInt();
            if (no_advertise > with_advertise - ad_cost)
                System.out.println("do not advertise");
            else if (no_advertise < with_advertise - ad_cost)
                System.out.println("advertise");
            else
                System.out.println("does not matter");
        }
    }
}