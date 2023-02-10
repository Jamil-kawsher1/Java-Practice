import java.util.Scanner;

public class EncryptWord {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        String lowerword = word.toLowerCase();
       
        String replace1 = lowerword.replace("a", "f");
        String replace2 = replace1.replace("p", "u");
        String replace3 = replace2.replace("l", "q");
        String replace4 = replace3.replace("e", "j");
        String first = replace4.substring(0, 1).toUpperCase();
        String last = replace4.substring(1);
        String finalWord = first.concat(last);

        System.out.println(finalWord);
    }

}
