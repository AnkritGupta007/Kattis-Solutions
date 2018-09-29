import java.util.Scanner;

public class HissingMic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = sc.next();
        
        if (pat.matches(".*ss.*")) 
            System.out.println("hiss");
        else 
            System.out.println("no hiss");
    }
}