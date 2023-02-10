import java.util.ArrayList;
import java.util.Scanner;

public class CountVoweConsonetFromAWord {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        System.out.println(word);


        String[] wordList = word.toLowerCase().split("");
        int vowelcount = 0;
        for (String leter : wordList) {
            if (leter.contains("a") || leter.contains("e")
                    || leter.contains("i") || leter.contains("o")
                    || leter.contains("u")) {
                vowelcount++;
            }

        }

        System.out.println("Vowel Count: " + vowelcount);
        int consonetCount = word.length() - vowelcount;

        System.out.println("consonents Count: " + consonetCount);
    }
}
