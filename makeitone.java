import java.util.*;

public class makeitone{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int cntNeg = 0, cntPos = 0;

            for (int i = 0; i < n; i++) {
                int val = sc.nextInt();
                if (val == -1) cntNeg++;
                else cntPos++;
            }

            int operations = 0;
            int sum = cntPos - cntNeg;

            while (sum < 0) {
                sum += 2;      
                cntNeg--;
                operations++;
            }

            if (cntNeg % 2 != 0) {
                operations++;
            }

            System.out.println(operations);
        }
    }
}
