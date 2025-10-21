import java.util.Scanner;

public class oandt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            int cnt2 = 0;

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
                if (a[i] == 2) cnt2++;
            }

            if (cnt2 % 2 != 0) {
                System.out.println(-1);
                continue;
            }

            int left2 = 0, k = -1;
            for (int i = 0; i < n - 1; i++) {
                if (a[i] == 2) left2++;
                if (left2 == cnt2 / 2) {
                    k = i + 1;
                    break;
                }
            }

            System.out.println(k);
        }
    }
}
