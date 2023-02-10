import java.util.Scanner;

public class CountNotes {
    public static void main (String[] args) {
        int[] notes = {1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        Scanner sc = new Scanner(System.in);
        int note1000 = 0;
        int note500 = 0;
        int note200 = 0;
        int note100 = 0;
        int note50 = 0;
        int note20 = 0;
        int note10 = 0;
        int note5 = 0;
        int note2 = 0;
        int note1 = 0;
        int amount = sc.nextInt();


        for (int i = 0; i < notes.length; i++) {

            while (amount >= notes[i]) {


                if (amount >= 1000) {

                    amount -= notes[i];

                    note1000++;
                } else if (amount >= 500) {
                    amount -= notes[i];

                    note500++;
                } else if (amount >= 100) {
                    amount -= notes[i];
                    note100++;
                } else if (amount >= 50) {
                    amount -= notes[i];
                    note50++;
                } else if (amount >= 20) {
                    amount -= notes[i];
                    note20++;
                } else if (amount >= 10) {
                    amount -= notes[i];
                    note10++;
                } else if (amount >= 5) {
                    amount -= notes[i];
                    note5++;
                } else if (amount >= 2) {
                    amount -= notes[i];
                    note2++;
                } else if (amount >= 1) {
                    amount -= notes[i];
                    note1++;
                }
            }


        }


        if (note1000 > 0) {
            System.out.println("1000 " + note1000);
        }
        if (note500 > 0) {
            System.out.println("500 " + note500);
        }
        if (note200 > 0) {
            System.out.println("200 " + note200);
        }
        if (note100 > 0) {
            System.out.println("100 " + note100);
        }
        if (note50 > 0) {
            System.out.println("50 " + note50);
        }
        if (note20 > 0) {
            System.out.println("20 " + note20);
        }
        if (note10 > 0) {
            System.out.println("10 " + note10);
        }
        if (note5 > 0) {
            System.out.println("5 " + note5);
        }
        if (note2 > 0) {
            System.out.println("2 " + note2);
        }
        if (note1 > 0) {
            System.out.println("1 " + note1);
        }


    }
}
