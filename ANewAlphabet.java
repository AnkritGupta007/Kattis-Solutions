import java.util.*;

public class ANewAlphabet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pat = sc.nextLine();
        String translated = "";
        
        HashMap<Character,String> convert = new HashMap<Character,String>();
        convert.put('a',"@");
        convert.put('b',"8");
        convert.put('c',"(");
        convert.put('d',"|)");
        convert.put('e',"3");
        convert.put('f',"#");
        convert.put('g',"6");
        convert.put('h',"[-]");
        convert.put('i',"|");
        convert.put('j',"_|");
        convert.put('k',"|<");
        convert.put('l',"1");
        convert.put('m',"[]\\/[]");
        convert.put('n',"[]\\[]");
        convert.put('o',"0");
        convert.put('p',"|D");
        convert.put('q',"(,)");
        convert.put('r',"|Z");
        convert.put('s',"$");
        convert.put('t',"']['");
        convert.put('u',"|_|");
        convert.put('v',"\\/");
        convert.put('w',"\\/\\/");
        convert.put('x',"}{");
        convert.put('y',"`/");
        convert.put('z',"2");
        
        for (int i = 0; i < pat.length(); i++) {
            translated += convert.get(Character.toLowerCase(pat.charAt(i))) != null ? convert.get(Character.toLowerCase(pat.charAt(i))) : pat.charAt(i);
        }
        System.out.println(translated);
    }
}