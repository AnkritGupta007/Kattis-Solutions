import java.util.Scanner;

public class Server {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(), time = sc.nextInt(), count = 0;
        
        
        for (int i = 0; i < n; i++) {
            time -= sc.nextInt();
            
            if (time >= 0)
                count++;
            else
                break;
        }
        System.out.println(count);
    }
}