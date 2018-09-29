import java.util.Scanner;

public class Trik {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = sc.next();
        int pos = 0;
        
        for (int i = 0; i < pat.length(); i++) {
            if (pat.charAt(i) == 'A' && pos != 2)
                pos = -pos + 1;
            if (pat.charAt(i) == 'B' && pos != 0)
                pos = -pos + 3;
            if (pat.charAt(i) == 'C' && pos != 1) 
                pos = -pos + 2;
        }
        pos++;
        System.out.println(pos);
    }
}