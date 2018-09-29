import java.util.Scanner;

public class JudgingMoose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int left = sc.nextInt();
        int right = sc.nextInt();
       
       if (left == 0 && right == 0) {
            System.out.println("Not a moose");
            System.exit(0);
       }
       
        int tot = Math.max(left, right);
        boolean even = false;
        
        if (right == left) even = true;
        
        System.out.println((even == true ? "Even " : "Odd ") + tot*2);
        
    }
}