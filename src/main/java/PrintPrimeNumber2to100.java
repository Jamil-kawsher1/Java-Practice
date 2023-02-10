//1. Print prime numbers form 2 to 100

public class PrintPrimeNumber2to100 {

    static boolean flag = true;
    static int count = 0;

    public static void main (String[] args) {
        int n = 100;
        System.out.println("Prime numbers from 2 to " + n + " are:");
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println(i);
            }
        }
    }
}
