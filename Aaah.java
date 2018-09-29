import java.util.Scanner;

public class Aaah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String first = sc.next();
        String second = sc.next();
        
        if (first.length() < second.length()) {
            System.out.println("no");
        } else {
            System.out.println("go");
        }
    }
}