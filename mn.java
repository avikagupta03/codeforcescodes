import java.util.Scanner;

public class mn {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();
        long sum=0;
        for(int i=0;i<input-1;i++){
            sum+=sc.nextInt();
        }
        long majorsum=(long)input*(input+1)/2;//here we have to convert before multiplication before as it aboid overflwo value loosing
        System.out.println(majorsum-sum);
    }
}
