//3.  Find out sum of digits of a number
//        Input: 152
//        Output: 8


public class FindOutDigitSum {
    public static void main (String[] args) {

        String nn = "152";

        String[] result = nn.split("");

        int sum = 0;
        for (String ele : result
        ) {
            sum += Integer.parseInt(ele);
        }
        System.out.println(sum);
    }
}
