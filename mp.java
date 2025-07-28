import java.util.*;
public class mp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int x2 = sc.nextInt();
        int x3 = sc.nextInt();
        int[] pos = {x1, x2, x3};
        Arrays.sort(pos);
        int minP = pos[1];
        int totalDistance = Math.abs(x1 - minP) + Math.abs(x2 - minP) + Math.abs(x3 - minP);
        System.out.println(totalDistance);
        sc.close();
    }
}
