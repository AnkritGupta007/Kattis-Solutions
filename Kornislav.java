import java.util.*;

public class Kornislav {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] points = new int[4];
        
        for (int i = 0; i < 4; i++) 
            points[i] = sc.nextInt();
        
        Arrays.sort(points);
        System.out.println(points[0]*points[2]);
    }
}