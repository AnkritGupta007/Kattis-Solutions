import java.util.Scanner;

public class EraseSecurely {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flips = sc.nextInt();
        boolean odd = false;
        
        if (flips % 2 != 0) odd = true;
        
        String a = sc.next();
        String b = sc.next();
            
        int n = a.length();
        for (int i = 0; i < n; i++) {
            if ((!(a.charAt(i) == b.charAt(i)) && !odd) || ((a.charAt(i) == b.charAt(i)) && odd)) {
                System.out.println("Deletion failed");
                System.exit(0);
            }
        }
        System.out.println("Deletion succeeded");
    }  
}