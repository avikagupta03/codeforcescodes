import java.util.Scanner;

public class shape {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine(); 
        int res = 0;

        for (int i = 0; i < n; i++) {
            String inp = sc.nextLine();
            if (inp.equals("Tetrahedron")) {
                res += 4;
            }
            if (inp.equals("Cube")) {
                res += 6;
            }
            if (inp.equals("Octahedron")) {
                res += 8;
            }
            if (inp.equals("Dodecahedron")) {
                res += 12;
            }
            if (inp.equals("Icosahedron")) {
                res += 20;
            }
        }

        System.out.println(res);
    }
}
