import java.util.Scanner;

public class bit {
    public static void main(String[] args) {
        int x = 0;
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < input; i++) {
            String change = sc.nextLine();
            if (change.equals("++X") || change.equals("++x")) {
                ++x;
            } else if (change.equals("X++") || change.equals("x++")) {
                x++;
            } else if (change.equals("--X") || change.equals("--x")) {
                --x;
            } else if (change.equals("X--") || change.equals("x--")) {
                x--;
            }
        }
        System.out.println(x);
        sc.close();
    }
}
