import java.util.Scanner;

public class Autori {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String original = sc.next();
        String ans = new String();
        ans += original.charAt(0);
        
        for (int i = 1; i < original.length(); i++) {
            if(original.charAt(i) >= 'A' && original.charAt(i) <= 'Z')
                ans += original.charAt(i);
        }
        System.out.println(ans);
    }
}