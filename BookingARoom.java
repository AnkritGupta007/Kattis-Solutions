import java.util.Scanner;

public class BookingARoom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rooms = sc.nextInt();
        int numbooked = sc.nextInt();
        int[] bookedrooms = new int[numbooked+1];
        boolean[] full = new boolean[rooms+1];
        
        for (int i = 1; i <= numbooked; i++) {
            bookedrooms[i] = sc.nextInt();
        }
        for (int i = 1; i <= numbooked; i++) {
            full[bookedrooms[i]] = true;
        }
        for (int i = 1; i <= rooms; i++) {
            if (full[i] == false) {
                System.out.println(i);
                break;
            }
            if (i == rooms)
                System.out.println("too late");
        }
    }
}