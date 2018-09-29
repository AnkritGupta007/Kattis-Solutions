import java.util.*;

public class NoDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = sc.nextLine();
        String[] list = pat.split(" ");
        
        Set<String> words = new HashSet<String>();
        boolean dups = false;
        
        for (String word: list) {
            if (!words.add(word)) {
                dups = true;
                break;
            }
        }
        System.out.println(dups == false ? "yes" : "no");
    }
}