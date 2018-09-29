import java.util.Scanner;

public class Sibice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), length = sc.nextInt(), width = sc.nextInt();
        double diag = Math.sqrt(width*width+length*length);
        
        for (int i = 0; i < n; i++) {
            int temp = sc.nextInt();
            
            if (temp <= diag)
                System.out.println("DA");
            else
                System.out.println("NE");
        }
    }
}