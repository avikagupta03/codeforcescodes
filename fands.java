import java.util.Scanner;

public class fands {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); 
        int m = sc.nextInt(); 

        Character[][] mat = new Character[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = '.';
            }
        }

        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < m; j++) {
                    mat[i][j] = '#';
                }
            } else if (i % 4 == 1) {
                mat[i][m - 1] = '#';
            } else {
                mat[i][0] = '#';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(mat[i][j]);
            }
            System.out.println();
        }
    }
}
