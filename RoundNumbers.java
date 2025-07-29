import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RoundNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            List<Integer> roundNumbers = new ArrayList<>();
            int place = 0;
            while (n > 0) {
                int digit = n % 10;
                if (digit != 0) {
                    int round = digit * (int)Math.pow(10, place);
                    roundNumbers.add(round);
                }
                n /= 10;
                place++;
            }
            System.out.println(roundNumbers.size());
            for (int num : roundNumbers) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
