import java.util.Scanner;

public class Factovisors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        next: while (sc.hasNext()) {
               
                int n = sc.nextInt();
                int m = sc.nextInt();
                
                if (m == 0) {
                    System.out.println(m + " does not divide " + n +"!");
                    continue;
                }
               
                if (m ==1) {
                    System.out.println(m + " divides " + n +"!");
                    continue;
                }
                
                if (m <= n) {
                    System.out.println(m + " divides " + n +"!");
                    continue;
                }
                
                int temp = m;
                int count = 0;
                
                for (int factor = 2; factor <= (int)Math.ceil(Math.sqrt(m)); factor++) {
                    
                    while (m % factor == 0) {
                        m /= factor;
                        count++;
                    }
                    
                    if (count > 0) {
                        
                        for (int j = factor; j <= n; j *= factor) {
                            count -= n / j;
                        }
                        
                        if (count > 0) {
                            System.out.println(temp + " does not divide " + n +"!");
                            continue next;
                        }
                    }
                    count = 0;
                }
                
                if (m <= n) 
                    System.out.println(temp + " divides " + n + "!");
                else 
                    System.out.println(temp + " does not divide " + n + "!");
        }
    }
}