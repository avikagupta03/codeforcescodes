import java.util.Scanner;

public class count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            sc.nextLine(); 
            String x = sc.nextLine();
            String s = sc.nextLine();

            int count = 0;
            String original = x;
            boolean found = false;

            while (x.length() <= s.length() + original.length()) {
                if (x.contains(s)) {
                    found = true;
                    break;
                }
                x += original;
                count++;
            }

            if (found) {
                System.out.println(count-1);
            } else {
                System.out.println(-1);
            }
        }
    }
}
