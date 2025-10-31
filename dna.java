import java.util.Scanner;

public class dna {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int l = 1;
        int longest = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                l++;
            } else {
                l = 1;
            }
            longest = Math.max(longest, l); // always update max
        }

        System.out.println(longest);
    }
}
