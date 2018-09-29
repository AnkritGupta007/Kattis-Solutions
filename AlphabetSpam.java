import java.util.Scanner;

public class AlphabetSpam {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = sc.next();
        int n=pat.length(), white=0, lower=0, upper=0, symbols=0;
        
        for (int i = 0; i <n; i++) {
            char curr = pat.charAt(i);
            
            if (curr == '_') {
                white++;
            }
             else if (curr >= 'a' && curr <= 'z') {
                lower++;
            }
            else if (curr >= 'A' && curr <= 'Z') {
                upper++;
            }
            else {
                symbols++;
            }
        }
        System.out.println((double)white/n);
        System.out.println((double)lower/n);
        System.out.println((double)upper/n);
        System.out.println((double)symbols/n);
    }
}