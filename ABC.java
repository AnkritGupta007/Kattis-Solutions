import java.util.*;
public class ABC {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> numbers = new ArrayList<>();
       
        while(sc.hasNextInt()){
            numbers.add(sc.nextInt());
        }
        Collections.sort(numbers);
        sc.nextLine();

        char[] order = sc.nextLine().toCharArray();

        for(int i = 0; i < order.length; i++){
            switch(order[i]){
                case 'A':
                    System.out.println(numbers.get(0));
                    break;
                case 'B':
                    System.out.println(numbers.get(1));
                    break;
                case 'C':
                    System.out.println(numbers.get(2));
                    break;
            }
        }
    }
}