import java.util.ArrayList;
import java.util.Scanner;

public class bspace {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while (t-->0){
            int n=sc.nextInt();
            int count=0;
            int maxCount=0;
            for(int i=0;i<n;i++){
                int val=sc.nextInt();
                if(val==0){
                    count++;
                    maxCount=Math.max(maxCount, count);
                }
                else{
                    count=0;
                }
            }
            System.out.println(maxCount);
        }
    }
}
