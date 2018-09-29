import java.util.Scanner;

public class Ladder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        int degrees = sc.nextInt();
        double radians = Math.toRadians(degrees);
        
        System.out.println((int)Math.ceil(height/Math.sin(radians)));
    }
}