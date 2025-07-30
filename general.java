import java.util.Scanner;

public class general {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        int max = a[0], min = a[0];
        for (int h : a) {
            if (h > max) max = h;
            if (h < min) min = h;
        }
        
        int maxIdx = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == max) {
                maxIdx = i;
                break;
            }
        }
        
        int minIdx = 0;
        for (int i = n - 1; i >= 0; i--) {
            if (a[i] == min) {
                minIdx = i;
                break;
            }
        }
        
        int moves = maxIdx + (n - 1 - minIdx);
        if (maxIdx > minIdx) moves -= 1;
        System.out.println(moves);
    }
}
