import java.util.Scanner;

public class SevenWonders {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String pat = sc.next();
        int t = 0, c = 0, g = 0, n = pat.length(); 
        
        for (int i = 0; i < n; i++) {
            if (pat.charAt(i) == 'T') t++;
            else if (pat.charAt(i) == 'C') c++;
            else g++;
        }
        int total = t*t + c*c + g*g + (7 * Math.min(Math.min(c,g),t));
        
        System.out.println(total);
    }
}