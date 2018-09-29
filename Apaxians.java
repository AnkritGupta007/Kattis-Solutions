import java.util.Scanner;

public class Apaxians {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String original = sc.next();
        String name = "";
        name += original.charAt(0);
        
        for (int i = 1; i < original.length(); i++) {
            if (original.charAt(i) != original.charAt(i-1))
                name += original.charAt(i);
        }
        
        System.out.println(name);
    }
}