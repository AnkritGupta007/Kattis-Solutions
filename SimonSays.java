import java.util.Scanner;

public class SimonSays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        while(sc.hasNext()) {
            String says = sc.nextLine();
            if (says.startsWith("Simon says"))
                System.out.println(says.substring(10));
            else
                System.out.println();
        }
    }
}
