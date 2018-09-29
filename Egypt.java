import java.util.Scanner;
import java.util.Arrays;

public class Egypt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        while (sc.hasNext()) {
            double[] lengths = new double[3];
           
            for (int i = 0; i < 3; i++) 
                lengths[i] = (double)sc.nextInt();
                
            Arrays.sort(lengths);
                
            if (lengths[0] == 0 && lengths[1] == 0 && lengths[2] == 0)
                break;
            
            if (lengths[0]*lengths[0] + lengths[1]*lengths[1] == lengths[2]*lengths[2])
                System.out.println("right");
            else
                System.out.println("wrong");
        }
    }
}