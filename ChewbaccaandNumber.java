import java.util.Scanner;

public class ChewbaccaandNumber{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < x.length(); i++) {
            char ch = x.charAt(i);
            int digit = ch - '0';
            int inverted = 9 - digit;

            if (i == 0 && digit == 9) {
                result.append('9');
            } else {
                result.append((char) ('0' + Math.min(digit, inverted)));
            }
        }

        System.out.println(result.toString());
    }
}
