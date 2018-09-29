import java.util.*;

public class Modulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<Integer>();
        int curr = 0;
        
        while (sc.hasNext()) {
            curr = sc.nextInt() % 42;
            
            if (!nums.contains(curr)) 
                nums.add(curr);
        }
        
        System.out.println(nums.size());
    }
}
