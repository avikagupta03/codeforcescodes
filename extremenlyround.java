import java.util.Scanner;

public class extremenlyround {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while (t-->0){
            //one non zero digit-extremely round;
            int x=sc.nextInt();
            String num = String.valueOf(x);
            int len = num.length();
            int first = num.charAt(0) - '0';
            int count = (len - 1) * 9 + first;
            System.out.println(count);
        }
    }
}