import java.util.Scanner;

public class present {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        int[] res = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            res[p[i] - 1] = i + 1;
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(res[i] + " ");
        }
    }
}
