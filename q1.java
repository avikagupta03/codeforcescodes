import java.util.*;

public class q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong(); 
        StringBuilder sb = new StringBuilder();

        while (n != 1) {
            sb.append(n).append(" ");
            if (n % 2 == 0)
                n /= 2;
            else
                n = n * 3 + 1;
        }
        sb.append(1);
        System.out.println(sb.toString());
    }
}
